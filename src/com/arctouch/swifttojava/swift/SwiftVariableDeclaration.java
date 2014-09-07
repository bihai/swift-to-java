package com.arctouch.swifttojava.swift;

public class SwiftVariableDeclaration implements SwiftExpression {
	public boolean mutable;
	public String name;
	public String type;
	
	@Override
	public String toString() {
		
		String varDeclaration = !mutable? "final " : "";
		return varDeclaration + type + " " + name;
	}
}
