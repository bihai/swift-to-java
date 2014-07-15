package com.arctouch.swifttojava.swift;

import java.util.ArrayList;

public class SwiftFunction {
	public String name;
	public SwiftReturn functionReturn;
	public boolean constructor;
	public boolean curried;
	public final ArrayList<ArrayList<SwiftParameter>> parameters = new ArrayList<ArrayList<SwiftParameter>>();
	
	public final ArrayList<SwiftExpression> statements = new ArrayList<SwiftExpression>();

	public SwiftFunction(final String name) {
		this.name = name;
	}

	public static class SwiftReturn {
		public boolean noReturn;
		public boolean tuple;
		public boolean named;
		public final ArrayList<String> types = new ArrayList<String>();
		public final ArrayList<String> names = new ArrayList<String>();
	}

	public static class SwiftParameter {
		public String name;
		public String type;
		public boolean mutable;
		public boolean reference;
	}
}
