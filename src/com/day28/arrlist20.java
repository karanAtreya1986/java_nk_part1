package com.day28;

import java.util.ArrayList;

public class arrlist20 {

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
		
		System.out.println(studentnames);
	
	}

}

//[james, vibha, bond, james, null, null]












