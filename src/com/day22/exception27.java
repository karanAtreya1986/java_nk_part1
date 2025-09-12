package com.day22;

public class exception27 {
	
	//unreachable block in method m2.
	
	String name;

	public void m1() {
		System.out.println("m1");
		int i1=m2(name);
		System.out.println(i1);
	}
	
	public int m2(String name1) {
		System.out.println("m2 method " + name1);
		return 10;
		m1();//Unreachable code
	}
	
	public static void main(String[] args) {

		System.out.println("start of the code");

		try {

			exception27 e1=new exception27();
			e1=null;
			e1.name=null;
			System.out.println(e1.name);
			int i=9/0;
			System.out.println("after exception try block");
		}
		
		catch (Error e) {
			System.out.println("Catch block with exception");
			e.printStackTrace();
		}
		
		System.out.println("outside blocks");
	}

}













