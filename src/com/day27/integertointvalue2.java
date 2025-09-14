package com.day27;

public class integertointvalue2 {
	
	public static void main(String[] args) {
		
		//integer and int works same way when printed.
		
		Integer v1=100;
		System.out.println(v1+20);//120
		int v2=v1.intValue();
		System.out.println(v2);//100
		System.out.println(v2+20);//120
	}

}



