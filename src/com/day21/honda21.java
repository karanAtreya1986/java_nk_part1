package com.day21;

public class honda21 extends car18{

	public honda21() {
		super(120);
		System.out.println("Honda -- default const...");
	}

	public honda21(int a) {
		this(10); //Recursive constructor invocation honda21(int)
		//recursion not for constructors.
		System.out.println("Honda -- const..." + a);

	}

	public honda21(int a, int b) {
		super(a);
		System.out.println("Honda -- const..." + (a + b));
	}

}
