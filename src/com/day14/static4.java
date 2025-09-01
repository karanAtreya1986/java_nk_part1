package com.day14;

public class static4 {
	
	//can overload static no issues.
	//can mix static and non static in overload.
	//return type has not significance.

	public static void myMethod() {
        System.out.println("This is a static method with no parameters");
    }

    public static int myMethod(int x) {
        System.out.println("This is a static method with one integer parameter: " + x);
		return x;
    }

    public void myMethod(String s) {
        System.out.println("This is a static method with one string parameter: " + s);
    }
    
    public double myMethod(double s) {
        System.out.println("This is a static method with one double parameter: " + s);
		return s;
    }

    public static void myMethod(int x, int y) {
        System.out.println("This is a static method with two integer parameters: " + x + " and " + y);
    }

    public static void main(String[] args) {
    	
    	static4 s1 = new static4();
    	
		static4.myMethod();
		static4.myMethod(10);
		s1.myMethod("Hello");
		s1.myMethod(10.0);
		
	}
}

//This is a static method with no parameters
//This is a static method with one integer parameter: 10
//This is a static method with one string parameter: Hello
//This is a static method with one double parameter: 10.0
//
