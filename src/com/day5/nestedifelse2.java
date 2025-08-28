package com.day5;

public class nestedifelse2 {
	
	public static void main(String[] args) {
		
		int marks=100;
		
		if(marks<=100) {
			if(marks>=90) {
				System.out.println("grade a"); //grade a
				if(marks>=95) {
					System.out.println("greatest"); //greatest
					if(marks==100) {
						System.out.println("give clothes and uniform free"); //give clothes and uniform free
					}
				}
			}
		}
		else {
			System.out.println("invalid marks");
		}
	}

}
