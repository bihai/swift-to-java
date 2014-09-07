package com.arctouch.swifttojava.swift;

public class SwiftReturnStatement implements SwiftExpression {
	public SwiftExpression returnExpression;
	@Override
	public String toString() {
		return "return " + returnExpression.toString();
	}
}
