package com.arctouch.swifttojava.swift;

public class SwiftAssignment implements SwiftExpression {
	public SwiftExpression assignee;
	public SwiftExpression assignement;
	
	@Override
	public String toString() {
		return assignee.toString() + " = " + assignement.toString();
	}
}
