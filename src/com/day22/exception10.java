package com.day22;

public class exception10 {
	
	String name;
	
	//both exceptions come.
	//after the first exception rest of the code in try ignored.

	public static void main(String[] args) {

		System.out.println("start of the code");
		
		try {
			
			exception10 e1=new exception10();
			e1=null;
			e1.name=null;
			e1.name="karan";
			System.out.println(e1.name);
			
			int i=9/0;
			System.out.println("after exception try block");
		}
		catch (ArithmeticException e) {
			System.out.println("arithmetic exception handled");
			e.printStackTrace();
		}
		
		catch (NullPointerException e) {
			System.out.println("null pointer exception handled");
			e.printStackTrace();
		}

		System.out.println("outside blocks");
	}

}

//start of the code
//null pointer exception handled
//java.lang.NullPointerException: Cannot assign field "name" because "e1" is null
//	at com.day22.exception10.main(exception10.java:17)
//outside blocks






