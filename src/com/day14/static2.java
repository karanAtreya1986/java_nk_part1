package com.day14;

public class static2 {
	
	//can overload static no issues.
	//can mix static and non static in overload.

	public static void myMethod() {
        System.out.println("This is a static method with no parameters");
    }

    public static void myMethod(int x) {
        System.out.println("This is a static method with one integer parameter: " + x);
    }

    public void myMethod(String s) {
        System.out.println("This is a static method with one string parameter: " + s);
    }

    public static void myMethod(int x, int y) {
        System.out.println("This is a static method with two integer parameters: " + x + " and " + y);
    }

    
    //below method will give duplicate with first one.
//    Duplicate method myMethod() in type static2
//    public void myMethod() {
//        System.out.println("This is a non-static method with no parameters");
//    }
}

//This is a static method
//This is a static method
//This is a static method
//getting email

