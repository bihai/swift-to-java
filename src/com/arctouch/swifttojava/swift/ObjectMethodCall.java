package com.arctouch.swifttojava.swift;

import java.util.ArrayList;

public class ObjectMethodCall implements SwiftExpression {
	public SwiftExpression call;
	public final ArrayList<SwiftExpression> parameters = new ArrayList<SwiftExpression>();
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(call.toString());
		builder.append(" (");
		
		for (int i = 0; i < parameters.size(); ++i) {
			builder.append(parameters.get(i).toString());
		}
		
		builder.append(")");
		
		return builder.toString();
	}
}
