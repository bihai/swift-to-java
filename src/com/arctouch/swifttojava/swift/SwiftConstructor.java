package com.arctouch.swifttojava.swift;

import java.util.ArrayList;

public class SwiftConstructor implements SwiftExpression {
	public SwiftExpression constructor;
	public final ArrayList<SwiftExpression> parameters = new ArrayList<SwiftExpression>();
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("new ");
		builder.append(constructor.toString());
		builder.append(" (");
		
		if (parameters.size() > 0) {
			builder.append(parameters.get(0).toString());
			for (int i = 1; i < parameters.size(); ++i) {
				builder.append(", ");
				builder.append(parameters.get(i).toString());
			}
		}
		builder.append(")");
		
		return builder.toString();
	}
}
