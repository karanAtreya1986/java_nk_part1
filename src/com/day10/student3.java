package com.day10;

public class student3 {
	
	
	    String name;
	    int age;
	    String subject[];

	    public static void main(String[] args) {
	        // create object of Student
	    	student1 s1 = new student1();

	        // assign values to the object
	        s1.name = "John Doe";
	        s1.age = 20;
	        
	        //this is ok to give values.
	        s1.subject = new String[4];
	        s1.subject[0] = "java";
	        s1.subject[1] = "maths";
	        
	        System.out.println(s1.subject); //[Ljava.lang.String;@24d46ca6
	        System.out.println(s1.subject[0]); //java
	        System.out.println(s1.subject[1]); //maths
	        System.out.println(s1.subject[2]); //null
	        System.out.println(s1.subject[3]); //null
	       

	      
	    }
	

}
