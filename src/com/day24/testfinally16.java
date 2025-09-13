package com.day24;

public class testfinally16 {

	//method called getmarks.
	//takes in studentname.
	//method returns marks.
	public static int getmarks(String studentname) {
		//try finally without catch.
		
		System.out.println("getting marks for "+studentname);
		if(studentname.equals("johny")) {
			return 100;
		}else if(studentname.equals("rose")) {
			return 90;
		}else if(studentname.equals("tiger")) {
			return 80;
		}else {
			System.out.println("no student found .........");
			try {
				int p=9/0;
			}finally {//finally block does not complete normally
				//warning message.
				return 5;
			}
		}
		
//		System.out.println("end of the method");//Unreachable code
	}

	public static void main(String[] args) {

		int marks=getmarks("karan");
		System.out.println(marks);
		
		int marks1=testfinally16.getmarks("rose");
		System.out.println(marks1);
		
		System.out.println("end of the program");
	
	}

}

//getting marks for karan
//no student found .........
//5
//getting marks for rose
//90
//end of the program













