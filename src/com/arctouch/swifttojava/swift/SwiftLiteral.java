package com.arctouch.swifttojava.swift;

public class SwiftLiteral implements SwiftExpression{
	public String value;

	public SwiftLiteral(String value) {
		super();
		this.value = value;
	}

	@Override
	public String toString() {
		return value;
	}
}
