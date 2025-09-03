package com.day15;

public class classa {

	public static void main(String[] args) {
		System.out.println("class a main method");
		classb.main(args);
		
		String a[]= {"tiger" , "cat"};
		classb.main(a);

	}

}

//class a main method
//b class main method
//0
//[Ljava.lang.String;@24d46ca6
//b class main method
//2
//[Ljava.lang.String;@4517d9a3
//tiger
//cat


