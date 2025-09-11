package com.day21;

public class honda19 extends car18{
	
	 public honda19() {
		 //to call same class constructor.
		 this(10);
	        System.out.println("Honda -- default const...");
	    }

	    public honda19(int a) {
	    
	        System.out.println("Honda -- const..." + a);
	    	this(1,2); //Constructor call must be the first statement in a constructor
	    	//this cannot be second sentence for constructor call.
	    }

	    public honda19(int a, int b) {
	    	super(a);
	    	System.out.println("Honda -- const..." + (a + b));
	    }

}
