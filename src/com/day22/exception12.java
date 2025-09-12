package com.day22;

public class exception12 {
	
	String name;
	
	//normal code without exceptions.

	public static void main(String[] args) {

		System.out.println("start of the code");
		
		try {
			
			exception12 e1=new exception12();
			e1.name="karan";
			System.out.println(e1.name);
		}
		catch (NullPointerException e) {
			System.out.println("null pointer exception handled");
			e.printStackTrace();
		}
		try {
			int i=9/2;
			System.out.println("after exception try block");
		}
		catch (ArithmeticException e) {
			System.out.println("arithmetic exception handled");
			e.printStackTrace();
		}
		
		

		System.out.println("outside blocks");
	}

}

//start of the code
//karan
//after exception try block
//outside blocks








