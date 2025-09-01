package com.day14;

public class static1 {
	
	public void getemail() {
		System.out.println("getting email");
	}
	
	 public static void staticMethod() {
	        System.out.println("This is a static method");
	    }
	 
	 public static void main(String[] args) {
		
		 static1 obj = new static1();
		 
		 //to call static method use classname.
		 static1.staticMethod();
		 
		 //if in same class, then no need of classname also.
		 staticMethod();
		 
		 //call static method with object name.
		 obj.staticMethod();
		 //warning - The static method staticMethod() from the type static1 should be accessed in a static way
		 
		 //to call non static method use object.
		 obj.getemail();
	}

}

//This is a static method
//This is a static method
//This is a static method
//getting email

