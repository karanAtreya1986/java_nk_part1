package com.day21;

public class honda18 extends car18{
	
	 public honda18() {
		 //to call same class constructor.
		 this(10);
	        System.out.println("Honda -- default const...");
	    }

	    public honda18(int a) {
	    	this(1,2);
	        System.out.println("Honda -- const..." + a);
	    }

	    //Implicit super constructor car18() is undefined. Must explicitly invoke another constructor
	    //we have to call another constructor explicitly.
//	    public honda18(int a, int b) {
//	        System.out.println("Honda -- const..." + (a + b));
//	    }
	    
	    public honda18(int a, int b) {
	    	super(a);
	    	System.out.println("Honda -- const..." + (a + b));
	    }

}
