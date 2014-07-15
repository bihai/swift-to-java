package com.arctouch.swifttojava.swift;

public class SwiftIdentifier implements SwiftExpression{
	public String name;
	
	public SwiftIdentifier(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

}
