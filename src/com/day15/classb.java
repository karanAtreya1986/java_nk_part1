package com.day15;

public class classb {

	public static void main(String[] args) {
		System.out.println("b class main method");
//		System.out.println(args[0]);
//		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
//		at com.day15.classb.main(classb.java:7)
		System.out.println(args.length); //0
		System.out.println(args); //memory address printed.- [Ljava.lang.String;@24d46ca6
		
		// Print each argument
        for (String arg : args) {
            System.out.println(arg);
        }

	}

}
