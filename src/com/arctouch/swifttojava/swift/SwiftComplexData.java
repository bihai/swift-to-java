package com.arctouch.swifttojava.swift;

import java.util.ArrayList;

public class SwiftComplexData extends SwiftType {
	public static enum Kind {
		CLASS,
		STRUCT
	}
	
	public Kind kind = Kind.CLASS;
	public String parent;
	
	public final ArrayList<String> protocols = new ArrayList<String>();
	public final ArrayList<SwiftValueHolder> classState = new ArrayList<SwiftValueHolder>();
	public final ArrayList<SwiftFunction> classFunctions = new ArrayList<SwiftFunction>();
	public final ArrayList<SwiftValueHolder> instanceState = new ArrayList<SwiftValueHolder>();
	public final ArrayList<SwiftFunction> instanceFunctions = new ArrayList<SwiftFunction>();
}
