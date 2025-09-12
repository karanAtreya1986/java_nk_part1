package com.day23;

public class finally17 {
	
	public static void main(String[] args) {
		
		//loops also can be written inside try block.
		
		System.out.println("first line");
		
		try {
			int i=9/0;
			while(true) {
				break;
			}
			System.out.println("try block");
		}
		catch(ArithmeticException e) {
			System.out.println("Catch block");
			for(int i=1;i<=10;i++) {
				System.out.println(i);
			}
		}
		finally {
			System.out.println("finally block");
			for(int i=21;i<=30;i++) {
				System.out.println(i);
			}
		}
		
		System.out.println("last line");
	}

}

//first line
//Catch block
//1
//2
//3
//4
//5
//6
//7
//8
//9
//10
//finally block
//21
//22
//23
//24
//25
//26
//27
//28
//29
//30
//last line





