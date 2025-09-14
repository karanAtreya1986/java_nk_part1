package com.day28;

import java.util.ArrayList;

public class arrlist38 {

	//double type generics.
	public static void main(String[] args) {
		
		//one wrapper cannot hold other data type.
		//even if its lower value like primitive can hold.
		
		//create array list of double and store character in it.
		//compile error.
//		The method add(Double) in the type ArrayList<Double> 
//		is not applicable for the arguments (char)
		ArrayList<Double> studentnames=new ArrayList<Double>();
		studentnames.add('c');
		studentnames.add('%');
		studentnames.add('Y');
		studentnames.add('e');
		
		for(char e:studentnames) {
			System.out.println(e);
		}
	
	}

}















