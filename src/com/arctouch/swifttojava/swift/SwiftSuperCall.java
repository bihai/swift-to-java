package com.arctouch.swifttojava.swift;

import java.util.ArrayList;

public class SwiftSuperCall implements SwiftExpression {
	public String methodName;
	public String returnType;
	public final ArrayList<SwiftExpression> parameters = new ArrayList<SwiftExpression>();
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("super.");
		builder.append(methodName);
		builder.append(" (");
		
		for (int i = 0; i < parameters.size(); ++i) {
			builder.append(parameters.get(i).toString());
		}
		
		builder.append(")");
		
		return builder.toString();
	}
}
