package com.day28;

import java.util.ArrayList;

public class arrlist22 {

	//double type generics.
	public static void main(String[] args) {
		
		//null allowed in double also.
		ArrayList<Double> studentnames=new ArrayList<Double>();
		studentnames.add(10.52);
		studentnames.add(15.67);
		studentnames.add(20.43);
		studentnames.add(30.23);
		//add null
		//allowed
		studentnames.add(null);
		studentnames.add(null);
		
		System.out.println(studentnames);
	
	}

}

//[10.52, 15.67, 20.43, 30.23, null, null]














