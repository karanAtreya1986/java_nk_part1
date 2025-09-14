package com.day28;

import java.util.ArrayList;

public class arrlist24 {

	//Float type generics.
	public static void main(String[] args) {
		
		//null allowed in float also.
		ArrayList<Float> studentnames=new ArrayList<Float>();
		studentnames.add(10.25f);
		studentnames.add(58.98f);
		studentnames.add(45.56F);
		studentnames.add(67.89F);
		//add null
		//allowed
		studentnames.add(null);
		studentnames.add(null);
		
		System.out.println(studentnames);
	
	}

}

//[10.25, 58.98, 45.56, 67.89, null, null]
















