package com.day27;

public class chararraytostring1 {
	
	public static void main(String[] args) {
		
		char c1[]= {'a', '5', 't', '6', '$', '&'};
		
		String valueOf = String.valueOf(c1);
		System.out.println(valueOf);//a5t6$&
		
		System.out.println(valueOf+20);//a5t6$&20
	}

}

