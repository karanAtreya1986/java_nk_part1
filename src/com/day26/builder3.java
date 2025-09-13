package com.day26;

public class builder3 {
	
	public static void main(String[] args) {
		
	String s1="selenium";
//	s1.reverse//no reverse method in strings.
	
	StringBuilder sb1=new StringBuilder("selenium");
	StringBuilder sb2=sb1.reverse();
	System.out.println(sb1);
	System.out.println(sb2);
	
	
	StringBuilder sb3=new StringBuilder(s1);
	StringBuilder sb4=sb3.reverse();
	System.out.println(sb3);
	System.out.println(sb4);
	
	System.out.println(s1);
	}

}

//muineles
//muineles
//muineles
//muineles
//selenium
