package com.arctouch.swifttojava;

import java.util.HashMap;

public class SymbolTable {
	enum Kind {
		Undefined, Klass, Protokol, Funktion, Variable, Konstant, Enumeration, Primitive
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
	
	private final HashMap<Scope, HashMap<String, Symbol>> symbols = new HashMap<SymbolTable.Scope, HashMap<String,Symbol>>();
	
	public SymbolTable() {
		symbols.put(Scope.Global, new HashMap<String, Symbol>());
		symbols.put(Scope.Klass, new HashMap<String, Symbol>());
		symbols.put(Scope.Funktion, new HashMap<String, Symbol>());
		symbols.put(Scope.Block, new HashMap<String, Symbol>());
		

		createSymbol("Activity", Kind.Klass, null, Scope.Global, "android.app.Activity");
		createSymbol("EditText", Kind.Klass, null, Scope.Global, "android.widget.EditText");
		createSymbol("Button", Kind.Klass, null, Scope.Global, "android.widget.Button");
		createSymbol("LinearLayout", Kind.Klass, null, Scope.Global, "android.widget.LinearLayout");
		createSymbol("View", Kind.Protokol, null, Scope.Global, "android.view.View");
		createSymbol("Bundle", Kind.Klass, null, Scope.Global, "android.os.Bundle");
		createSymbol("Editable", Kind.Klass, null, Scope.Global, "android.text.Editable");
		createSymbol("OnClickListener", Kind.Protokol, null, Scope.Global, "android.view.View.OnClickListener");

		createSymbol("Double", Kind.Klass, null, Scope.Global, "double");
		createSymbol("Float", Kind.Klass, null, Scope.Global, "float");
		createSymbol("Bool", Kind.Klass, null, Scope.Global, "boolean");
		createSymbol("Int", Kind.Klass, null, Scope.Global, "int");
		createSymbol("Int8", Kind.Klass, null, Scope.Global, "char");
		createSymbol("Int16", Kind.Klass, null, Scope.Global, "short");
		createSymbol("Int32", Kind.Klass, null, Scope.Global, "int");
		createSymbol("Int64", Kind.Klass, null, Scope.Global, "long");

		
		createSymbol("max", Kind.Funktion, null, Scope.Global, "Math.max");
		createSymbol("min", Kind.Funktion, null, Scope.Global, "Math.min");
	}
	
	
	public Symbol createSymbol(String name, Kind kind, String parent, Scope scope, String translation) {
		Symbol parentSymbol = findSymbol(parent);
		
		Symbol symbol = new Symbol();
		symbol.name = name;
		symbol.kind = kind;
		symbol.parent = parentSymbol;
		symbol.scope = Scope.Global;
		symbol.knownTranslations = translation;
		symbols.get(scope).put(name, symbol); 
		return symbol; 
	}


	public Symbol findSymbol(String symbol) {
		if (symbol == null) {
			return null;
		}
		if (symbols.get(Scope.Block).containsKey(symbol)) {
			return symbols.get(Scope.Block).get(symbol);
		}
		
		if (symbols.get(Scope.Funktion).containsKey(symbol)) {
			return symbols.get(Scope.Funktion).get(symbol);
		}

		if (symbols.get(Scope.Klass).containsKey(symbol)) {
			return symbols.get(Scope.Klass).get(symbol);
		}

		if (symbols.get(Scope.Global).containsKey(symbol)) {
			return symbols.get(Scope.Global).get(symbol);
		}
		return createSymbol(symbol, Kind.Undefined, null, Scope.Global, null);
	}
}
