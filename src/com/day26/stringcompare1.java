package com.day26;

public class stringcompare1 {
	
	/**
	 * .equals – 
Compares the string content irrespective of how we create strings 
either using literals or objects. Best way to compare strings.
String literals always stored in scp (inside heap memory).
== will compare if the references point to same thing.

	 * @param args
	 */
	
	public static void main(String[] args) {
		
		String s1="hello selenium";
		
		String s2=new String("hello selenium");
		
		String s3="hello selenium";
		
		System.out.println(s1==s2);//false

		System.out.println(s1.equals(s2));//true
		
		System.out.println(s1==s3); //true
		System.out.println(s1.equals(s3));//true
		System.out.println(s2==s3);//false
		System.out.println(s2.equals(s3));//true
	}

}



