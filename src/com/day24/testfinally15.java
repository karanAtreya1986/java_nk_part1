package com.day24;

public class testfinally15 {

	//method called getmarks.
	//takes in studentname.
	//method returns marks.
	public static int getmarks(String studentname) {
		
		//exit one.
		//when exception, exit statement is not reached and programs as usual.
		//here return of finally taken.
		System.out.println("getting marks for "+studentname);
		if(studentname.equals("johny")) {
			try {
				int i=9/0;
				System.exit(0); //shutdown jvm.
				return 10;
			} catch (ArithmeticException e) {
				System.out.println("arithmetic exception ............");
				return 23434;
			}
			finally {
				System.out.println("finally block.............");
				return 10;
			}
//			return 100;//Unreachable code
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
		
		int marks1=testfinally15.getmarks("rose");
		System.out.println(marks1);
		
		System.out.println("end of the program");
	
	}

}

//getting marks for johny
//arithmetic exception ............
//finally block.............
//10
//getting marks for rose
//90
//end of the program












