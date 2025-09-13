package com.day26;

import java.util.Iterator;

public class reversestring5 {

	public static String reverseString(String name) {



		//when string length is 1 then return as is.
		if(name.length()==1) {
			return name;
		}

		//if null check is not first then what happens.
		//program terminates abruptly when null comes.
		//we need to use try catch to solve this or test null values 
//		from main at last.
		//Dead code
		if(name==null) {
			throw new RuntimeException("string cannot be null");
		}

		int len=name.length();

		String rev="";

		for(int i=len-1;i>=0;i--) {

			rev=rev+name.charAt(i);
		}

		return rev;
	}

	public static void main(String[] args) {

		String s31=null;
		String s4=reverseString(s31);
		System.out.println(s4);

		String s1="selenium";
		String s2=reverseString(s1);
		System.out.println(s2);

		String s21="k";
		String s3=reverseString(s21);
		System.out.println(s3);



	}

}

//Exception in thread "main" java.lang.NullPointerException: 
//	Cannot invoke "String.length()" because "name" is null
//at com.day26.reversestring5.reverseString(reversestring5.java:12)
//at com.day26.reversestring5.main(reversestring5.java:36)




