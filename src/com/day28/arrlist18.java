package com.day28;

import java.util.ArrayList;

public class arrlist18 {

	//string type generics.
	public static void main(String[] args) {
		
		//create array list with duplicate values.
		//string type.
		ArrayList<String> studentnames=new ArrayList<String>();
		studentnames.add("james");
		studentnames.add("vibha");
		studentnames.add("bond");
		studentnames.add("james");
	
		System.out.println(studentnames);
	}

}

//[james, vibha, bond, james]










