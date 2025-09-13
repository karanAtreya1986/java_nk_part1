package com.day26;

public class builder2 {
	
	public static void main(String[] args) {
		
		//builder and buffer great additions.
		//they make string mutable.
		StringBuilder b1=new StringBuilder("selenium");
		StringBuilder b2=b1.append("karan");
		System.out.println(b1);
		System.out.println(b2);
		
	}

}

//seleniumkaran
//seleniumkaran
