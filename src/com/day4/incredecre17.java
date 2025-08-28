package com.day4;

public class incredecre17 {
	
	public static void main(String[] args) {
		
		int m=10, n=4;
		int p= --m * --n * n-- * m--;
		System.out.println(m); //9,8 
		System.out.println(n); //3, 2
		System.out.println(p); //9*3*3(2)*9(8)
	}

}
