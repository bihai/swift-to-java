package com.arctouch.swifttojava.swift;

import java.util.ArrayList;

import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

public class SwiftFor implements SwiftExpression {
	public SwiftExpression init;
	public SwiftExpression condition;
	public SwiftExpression increment;
	
	public final ArrayList<SwiftExpression> statements = new ArrayList<SwiftExpression>();
	
	@Override
	public String toString() {
		STGroup group = new STGroupFile("template/for.stg");
		ST st = group.getInstanceOf("for");
		st.add("for", this);
		return st.render();
	}
}
