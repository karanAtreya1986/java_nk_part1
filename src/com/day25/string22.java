package com.day25;

import java.util.Arrays;

public class string22 {

	public static void main(String[] args) {

		String pop = "KaranxXHelloXxXSeleniumxXTestingXxXGoogleX";
		String pp[] = pop.split("xX");

		System.out.println(pp[0]);

		int i1=pp[0].length();

		System.out.println(i1);	

		System.out.println(pp[1]);
		System.out.println(pp[2]);
		System.out.println(pp[3]);
		System.out.println(pp[4]);

		//print array in list form.
		System.out.println(Arrays.toString(pp));

		System.out.println(pp[5]); //no index present.




	}

}


//Karan
//5
//HelloX
//Selenium
//TestingX
//GoogleX
//[Karan, HelloX, Selenium, TestingX, GoogleX]
//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
//	Index 5 out of bounds for length 5
//	at com.day25.string22.main(string22.java:26)








