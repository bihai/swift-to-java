package com.arctouch.swifttojava.swift;


public class SwiftSuperCall implements SwiftExpression {
	public String methodName;
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("super.");
		builder.append(methodName);
		return builder.toString();
	}
}
