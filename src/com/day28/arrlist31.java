package com.day28;

import java.util.ArrayList;

public class arrlist31 {

	//String type generics.
	public static void main(String[] args) {
		
		ArrayList<String> studentnames=new ArrayList<String>();
		studentnames.add("james");
		studentnames.add("vibha");
		studentnames.add("bond");
		studentnames.add("james");
		//add null
		//allowed
		studentnames.add(null);
		studentnames.add(null);
		//add space and blank
		studentnames.add(" ");
		studentnames.add("");
		
		System.out.println(studentnames);
		String string = studentnames.get(1);
		System.out.println(string);
	
	}

}

//[james, vibha, bond, james, null, null,  , ]
//vibha














