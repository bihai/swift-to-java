package com.arctouch.swifttojava.swift;

public class SwiftCast implements SwiftExpression {
	public SwiftExpression source;
	public String type;
	
	public String toString() {
		if ("int".equals(type)) {
			return "Integer.valueOf(" + source + ")"; 
		}
		if ("String".equals(type)) {
			return "String.valueOf(" + source + ")"; 
		}
		return "(("+  type + ") " + source.toString() + ")"; 
		
		
		
	}

}
