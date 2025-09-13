package com.day24;

public class testfinally1 {

	//method called getmarks.
	//takes in studentname.
	//method returns marks.
	public static int getmarks(String studentname) {
		
		System.out.println("getting marks for "+studentname);
		if(studentname.equals("johny")) {
			//add exception with return.
			try {
				int i=9/0;
			} catch (ArithmeticException e) {
				System.out.println("arithmetic exception ............");
			}
			return 100;
		}else if(studentname.equals("rose")) {
			return 90;
		}else if(studentname.equals("tiger")) {
			return 80;
		}else {
			System.out.println("no student found .........");
			return -1;
		}
		
//		System.out.println("end of the method");//Unreachable code
	}

	public static void main(String[] args) {

		int marks=getmarks("johny");
		System.out.println(marks);
		
		int marks1=testfinally1.getmarks("rose");
		System.out.println(marks1);
		
		System.out.println("end of the program");
	
	}

}

//getting marks for johny
//arithmetic exception ............
//100
//getting marks for rose
//90
//end of the program


