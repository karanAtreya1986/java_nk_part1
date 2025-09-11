package com.day21;

public class honda17 extends car17{
	
	 public honda17() {
		 //to call same class constructor.
		 this(10);
	        System.out.println("Honda -- default const...");
	    }

	    public honda17(int a) {
	    	this(1,2);
	        System.out.println("Honda -- const..." + a);
	    }

	    public honda17(int a, int b) {
	        System.out.println("Honda -- const..." + (a + b));
	    }

}
