package com.day25;

public class string1 {

	public static void main(String[] args) {
		
		String str = "hi this is my java code and i am so happy";
		
		//get length of string. store in variable.
		
		int length = str.length();
		System.out.println(length);
		
		//print lower index of string
		
		System.out.println("lowest index is always " + 0);
		
		//print highest index.
		int i1=str.length()-1;
		
		System.out.println("highest index is always length -1 " + i1);
	}
}

//41
//lowest index is always 0
//highest index is always length -1 40
