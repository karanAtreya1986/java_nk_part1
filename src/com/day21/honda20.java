package com.day21;

public class honda20 extends car18{

	public honda20() {
		//this and super cannot be together in constructor.
		this(10);
		super(10);//Constructor call must be the first statement in a constructor
		System.out.println("Honda -- default const...");
	}

	public honda20(int a) {
		super(10, "tiger");
		this(1);//Constructor call must be the first statement in a constructor
		//this and super cannot be together in constructor.

		System.out.println("Honda -- const..." + a);

	}

	public honda20(int a, int b) {
		super(a);
		System.out.println("Honda -- const..." + (a + b));
	}

}
