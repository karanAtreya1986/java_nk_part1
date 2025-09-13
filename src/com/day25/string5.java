package com.day25;

public class string5 {

	public static void main(String[] args) {
		
		String str = "hi this is my java code and i am so happy";
		
//index of function.
		//takes in character or string, and start index if needed.
		int i1=str.indexOf("java");
		System.out.println(i1); //14
		
		//index of word which is not present.
		int i2=str.indexOf("javaa");
		System.out.println(i2); //-1
		
		//change case sensitive and check if word present.
		int i3=str.indexOf("JAVA");
		System.out.println(i3); //-1

	}
}


