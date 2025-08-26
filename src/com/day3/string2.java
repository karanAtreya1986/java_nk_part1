package com.day3;

public class string2 {
	
public static void main(String[] args) {
		
		String name="karan";
		String num="2434";
		
		String name1="karan";
		String num1="-243erer.4234";
		
		String x="hello";
		String y="Selenium";
		
//		String a1=100; //Type mismatch: cannot convert from int to String
//		String b1=-32.34; //Type mismatch: cannot convert from double to String
		
		int a=100;
		int b=-3434;
		
		double c=32434.23434;
		double d=-32434.2343434;
		
		System.out.println(a+b+x+y+a+b+c+d); //-3334helloSelenium100-343432434.23434-32434.2343434
		System.out.println(a+b+x+y+(a+b+c+d)); //-3334helloSelenium-3334.0000034000004
		System.out.println(a+b+c+d+x+y); //-3334.0000034000004helloSelenium
		
		System.out.println("the value of a is " + a); //the value of a is 100
		System.out.println("the value of b is "  + b); //the value of b is -3434
		System.out.println("the sum of a and b is " + a+b); //the sum of a and b is 100-3434
		System.out.println("the sum of a and b is " + (a+b)); //the sum of a and b is -3334
		System.out.println("the sum of a and b is " + c+d ); //the sum of a and b is 32434.23434-32434.2343434
		System.out.println("the sum of a and b is " + (c+d)); //the sum of a and b is -3.4000004234258085E-6

}
}
