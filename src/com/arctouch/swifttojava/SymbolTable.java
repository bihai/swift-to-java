package com.arctouch.swifttojava;

import java.util.HashMap;

public class SymbolTable {
	enum Kind {
		Undefined, Klass, Protokol, Funktion, Variable, Konstant, Enumeration, Primitive, Type,
	}

	enum Scope {
		Global, Klass, Funktion, Block
	}

	static class Symbol {
		public String name;
		public Kind kind;
		public Symbol parent;
		public Scope scope;
		public String knownTranslations;

		public String translate() {
			return knownTranslations == null ? name : knownTranslations;
		}
	}

	private final HashMap<Scope, HashMap<Kind, HashMap<String, Symbol>>> symbols = new HashMap<SymbolTable.Scope, HashMap<Kind, HashMap<String, Symbol>>>();

	public void createTable(Scope scope) {
		HashMap<Kind, HashMap<String, Symbol>> submap = new HashMap<SymbolTable.Kind, HashMap<String, Symbol>>();

		for (Kind k : Kind.values()) {
			submap.put(k, new HashMap<String, SymbolTable.Symbol>());
		}

		symbols.put(scope, submap);
	}

	public SymbolTable() {
		createTable(Scope.Global);
		createTable(Scope.Klass);
		createTable(Scope.Funktion);
		createTable(Scope.Block);

		createSymbol("Double", Kind.Klass, null, Scope.Global, "double");
		createSymbol("Float", Kind.Klass, null, Scope.Global, "float");
		createSymbol("CGFloat", Kind.Klass, null, Scope.Global, "float");
		createSymbol("Bool", Kind.Klass, null, Scope.Global, "boolean");
		createSymbol("Int", Kind.Klass, null, Scope.Global, "int");
		createSymbol("Int8", Kind.Klass, null, Scope.Global, "char");
		createSymbol("Int16", Kind.Klass, null, Scope.Global, "short");
		createSymbol("Int32", Kind.Klass, null, Scope.Global, "int");
		createSymbol("Int64", Kind.Klass, null, Scope.Global, "long");

		createSymbol("ATKButton", Kind.Klass, null, Scope.Global, "com.arctouch.toolkit.ATKButton");
		
		createSymbol("ATKLabel", Kind.Klass, null, Scope.Global, "com.arctouch.toolkit.ATKLabel");
		createSymbol("ATKRectangle", Kind.Klass, null, Scope.Global, "com.arctouch.toolkit.ATKRectangle");
		createSymbol("ATKRootView", Kind.Klass, null, Scope.Global, "com.arctouch.toolkit.ATKRootView");
		createSymbol("ATKApplication", Kind.Klass, null, Scope.Global, "com.arctouch.toolkit.ATKApplication");
		createSymbol("ATKClickListener", Kind.Klass, null, Scope.Global, "com.arctouch.toolkit.ATKClickListener");

		createSymbol("ATKViewContainer", Kind.Protokol, null, Scope.Global, "com.arctouch.toolkit.ATKViewContainer");
		createSymbol("ATKView", Kind.Protokol, null, Scope.Global, "com.arctouch.toolkit.ATKView");

		createSymbol("max", Kind.Funktion, null, Scope.Global, "Math.max");
		createSymbol("min", Kind.Funktion, null, Scope.Global, "Math.min");
		createSymbol("println", Kind.Funktion, null, Scope.Global,"System.out.println");
		
		createSymbol("String", Kind.Klass, null, Scope.Global, null);
		createSymbol("String", Kind.Funktion, null, Scope.Global,"String.valueOf");

		createSymbol("getText", Kind.Funktion, null, Scope.Klass,"getText().toString");
		createSymbol("StringToInt", Kind.Funktion, null, Scope.Global,"Integer.valueOf");
	}

	public Symbol createSymbol(String name, Kind kind, Symbol parent,
			Scope scope, String translation) {

		Symbol symbol = new Symbol();
		symbol.name = name;
		symbol.kind = kind;
		symbol.parent = parent;
		symbol.scope = Scope.Global;
		symbol.knownTranslations = translation;
		symbols.get(scope).get(kind).put(name, symbol);
		return symbol;
	}

	public Symbol findSymbol(String symbol, Kind kind) {
		if (symbol == null) {
			return null;
		}
		
		Symbol s = tryScope(symbol, Scope.Block, kind);
		if (s != null){
			return s;
		}
		
		s = tryScope(symbol, Scope.Funktion, kind);
		if (s != null){
			return s;
		}
		
		s = tryScope(symbol, Scope.Klass, kind);
		if (s != null){
			return s;
		}

		s = tryScope(symbol, Scope.Global, kind);
		if (s != null){
			return s;
		}
		return null;//createSymbol(symbol, Kind.Undefined, null, Scope.Global, null);
	}
	
	private Symbol tryScope(String name, Scope scope, Kind kind) {
		if (kind == Kind.Type) {
			Symbol s = tryScope(name, scope, Kind.Klass);
			if (s != null) return s;
			s = tryScope(name, scope, Kind.Protokol);
			if (s != null) return s;
			return null;
			
		}
		HashMap<String, Symbol> map = symbols.get(scope).get(kind);
		if (map.containsKey(name)) {
			return map.get(name);
		}
		if (kind == Kind.Undefined) return null;
		return tryUndefined(name, Scope.Block, kind);
	}
	
	private Symbol tryUndefined(String name, Scope scope, Kind kind) {
		HashMap<String, Symbol> map = symbols.get(scope).get(Kind.Undefined);
		if (map.containsKey(name)) {
			Symbol s = map.remove(name);
			s.kind = kind;
			symbols.get(scope).get(kind).put(name, s);
			return s;
		}
		
		return null;
	}
}
