package com.day28;

import java.util.ArrayList;

public class arrlist39 {

	//double type generics.
	public static void main(String[] args) {
		
		//one wrapper cannot hold other data type.
		//even if its lower value like primitive can hold.
		
		//create array list of double and store character in it.
		//compile error.
//		The method add(Double) in the type ArrayList<Double> 
//		is not applicable for the arguments (String)
		ArrayList<Double> studentnames=new ArrayList<Double>();
		studentnames.add("tiger");
		studentnames.add("lion");
		studentnames.add("goat");
		studentnames.add("cheetah");
		
		for(char e:studentnames) {
			System.out.println(e);
		}
	
	}

}















