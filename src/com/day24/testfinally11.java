package com.day24;

public class testfinally11 {

	//method called getmarks.
	//takes in studentname.
	//method returns marks.
	public static int getmarks(String studentname) {
		
		//exit one.
		//zero and one works same way.
		System.out.println("getting marks for "+studentname);
		if(studentname.equals("johny")) {
			try {
				int i=9/3;
				System.exit(1); //shutdown jvm.
				return 10;
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
		
		int marks1=testfinally11.getmarks("rose");
		System.out.println(marks1);
		
		System.out.println("end of the program");
	
	}

}

//getting marks for johny









