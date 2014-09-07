package com.arctouch.swifttojava.swift;

public class SwiftAssignment implements SwiftExpression {
	public SwiftExpression assignee;
	public SwiftExpression assignement;
	public String operator = "="; 
	
	@Override
	public String toString() {
		return assignee.toString() + operator + assignement.toString();
	}
}
