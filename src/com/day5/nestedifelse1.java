package com.day5;

public class nestedifelse1 {
	
	public static void main(String[] args) {
		
		int marks=97;
		
		if(marks<=100) {
			if(marks>=90) {
				System.out.println("grade a"); //grade a
				if(marks>=95) {
					System.out.println("greatest"); //greatest
				}
			}
		}
		else {
			System.out.println("invalid marks");
		}
	}

}
