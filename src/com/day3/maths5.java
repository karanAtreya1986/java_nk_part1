package com.day3;

public class maths5 {
	
	public static void main(String[] args) {
		
//		System.out.println((9/0)+'1'); //java.lang.ArithmeticException: / by zero
//		System.out.println((9/0)+"21"); //java.lang.ArithmeticException: / by zero
//		System.out.println((9/0)+"2"); //java.lang.ArithmeticException: / by zero

		System.out.println((9.0/0)+'1');  //Infinity
		System.out.println((9.0/0)+"21");  //Infinity21
		System.out.println((9.0/0)+"1");  //Infinity1
		
		
		System.out.println((0/9)+'1');  //49
		System.out.println((0/9)+"21"); //021
		System.out.println((0/9)+"1"); //01
		System.out.println((0/9.0)+'1'); //49.0
		System.out.println((0/9.0)+"21"); //0.021
		System.out.println((0/9.0)+"1"); //0.01
		
		
		System.out.println((9/0.0)+'1');  //Infinity
		System.out.println((9/00.00)+"21"); //Infinity21
		System.out.println((9/00.00)+"1"); //Infinity1
		System.out.println((9.0/00.00)+'1'); //Infinity
		System.out.println((9.0/0.0)+"21"); //Infinity21
		System.out.println((9/00.00)+"1"); //Infinity1
		
		
		System.out.println((00.00/9)+'1'); //49.0
		System.out.println((0.0/9)+"21"); //0.021
		System.out.println((0.0/9)+"1"); //0.01
		
		System.out.println((0.0/9.0)+'1');  //49.0
		System.out.println((00.000/9.0)+"21");  //0.021
		System.out.println((0.0/9)+"1"); //0.01
		
		System.out.println((9.0/0.0)+'1');  //Infinity
		System.out.println((9.2/00.000)+"21");  //Infinity21
		System.out.println((9.2/00.000)+"1"); //Infinity1
		
		System.out.println((9.0/00.000)+'1'); //Infinity
		System.out.println((9.0/0.0)+"21");  //Infinity21
		System.out.println((9.2/00.000)+"1"); //Infinity1
		

	}

}
