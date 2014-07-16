package com.arctouch.swifttojava.swift;

public class SwiftBinaryOp implements SwiftExpression{
	public SwiftExpression lvalue;
	public SwiftExpression rvalue;
	public String operator;
	
	@Override
	public String toString() {
		return lvalue.toString() + " " + operator + " " + rvalue.toString();
	}
}
