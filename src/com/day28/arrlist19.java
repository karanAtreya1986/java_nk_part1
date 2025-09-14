package com.day28;

import java.util.ArrayList;

public class arrlist19 {

	//String type generics.
	public static void main(String[] args) {
		
		//remove student with index number.
		ArrayList<String> studentnames=new ArrayList<String>();
		studentnames.add("james");
		studentnames.add("vibha");
		studentnames.add("bond");
		studentnames.add("james");
		
		String s1=studentnames.remove(2);
		System.out.println(s1);
		System.out.println(studentnames);
	}

}

//bond
//[james, vibha, james]











