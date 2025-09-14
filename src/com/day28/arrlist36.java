package com.day28;

import java.util.ArrayList;

public class arrlist36 {

	//integer type generics.
	public static void main(String[] args) {
		
		//one wrapper cannot hold other data type.
		//even if its lower value like primitive can hold.
		
		//create array list of integer and store double.
		//compile error.
//		The method add(Integer) in the type ArrayList<Integer> 
//		is not applicable for the arguments (double)
		ArrayList<Integer> studentnames=new ArrayList<Integer>();
		studentnames.add(10.34);
		studentnames.add(15.67);
		studentnames.add(20.67);
		studentnames.add(30.34);
		
		for(int e:studentnames) {
			System.out.println(e);
		}
	
	}

}















