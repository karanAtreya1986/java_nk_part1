package com.day14;

public class static3 {
	
	 public static void main(String[] args) {
	        System.out.println("This is the default main method");
	    }

	    public static void main(int[] args) {
	        System.out.println("This is the main method with integer array parameter");
	    }

	    public static void main(String s, String[] args) {
	        System.out.println("This is the main method with string and string array parameters");
	    }

	    public static void main() {
	        System.out.println("This is the main method with no parameters");
	    }

	    public static void main(String[] args, int x) {
	        System.out.println("This is the main method with string array and integer parameters");
	    }
	    
	    public static void main(int a) {
	    	System.out.println("this is one integer " + a);
	    }
	    
	    public static void main(int a, int b) {
	    	System.out.println("this is one integer " + a + " " + b);
	    }

}

//main method overloading.
//This is the default main method
//only the og one is called.