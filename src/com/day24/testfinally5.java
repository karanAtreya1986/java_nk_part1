package com.day24;

public class testfinally5 {

	//method called getmarks.
	//takes in studentname.
	//method returns marks.
	public static int getmarks(String studentname) {
		
		System.out.println("getting marks for "+studentname);
		if(studentname.equals("johny")) {
			//see the flow when catch has return.
			//first goes to the finally if present and then comes back to catch.
			//then runs all lines outside try catch finally.
			try {
				int i=9/0;
				return 234234;
			} catch (ArithmeticException e) {
				System.out.println("arithmetic exception ............");
				return 23434;
			}
			finally {
				System.out.println("finally block.............");
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
		
		int marks1=testfinally5.getmarks("rose");
		System.out.println(marks1);
		
		System.out.println("end of the program");
	
	}

}

//getting marks for johny
//arithmetic exception ............
//finally block.............
//23434
//getting marks for rose
//90
//end of the program





