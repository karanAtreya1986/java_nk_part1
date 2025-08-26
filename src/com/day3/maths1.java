package com.day3;

public class maths1 {
	
	public static void main(String[] args) {
		
		System.out.println(1+2); //3
		System.out.println(1-2); //-1
		System.out.println(8/3); //2 
		System.out.println(3/8); //0
		System.out.println(4*8); //32
		System.out.println(9.0/2); //4.5
		System.out.println(9/2.0); //4.5
		System.out.println(9.0/2.0); //4.5
		System.out.println(9/3); //3
		System.out.println(3/9); //0
		System.out.println(9.0/3.0); //3.0
		System.out.println(3.0/9.0); //0.3333333333333333
//		System.out.println(9/0); //java.lang.ArithmeticException: / by zero
		System.out.println(9.0/0); //Infinity
		System.out.println(9.0/0.0); //Infinity
		System.out.println(0/9); //0
		System.out.println(0/9.0); //0.0
		System.out.println(0.0/9.0); //0.0
		
		System.out.println(9/0.0); //Infinity
//		System.out.println(0/0); //java.lang.ArithmeticException: / by zero
		System.out.println(0/0.0); //NaN
		System.out.println(0.0/0); //NaN
		System.out.println(0.0/0.0); //NaN
		
//		System.out.println(-32434/0); //java.lang.ArithmeticException: / by zero
		System.out.println(-3244.32434/0); //-Infinity
		System.out.println(-32434/0.0); //-Infinity
		System.out.println(-23434.23434/0.0); //-Infinity
		System.out.println(-324324.32434/00000.0000000000); //-Infinity
		System.out.println(-23423432/00000.00000000); //-Infinity
		
		System.out.println(-9/3); //-3
		System.out.println(-9/-3); //3
		System.out.println(9/-3); //-3
		
		System.out.println(-9.8/2.3); //-4.260869565217392
		System.out.println(-9.8/-2.3); //4.260869565217392
		System.out.println(9.8/-2.3); //-4.260869565217392
		
		
		System.out.println(-0/32434); //0
		System.out.println(-0/3244.32434); //0.0
		System.out.println(-0.0/32434); //-0.0
		System.out.println(-0.0/23434.23434); //-0.0
		System.out.println(-00000.0000000000/324324.32434); //-0.0
		System.out.println(-00000.00000000/23423432); //-0.0
		
		
		
	}

}
