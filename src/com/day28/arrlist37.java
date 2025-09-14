package com.day28;

import java.util.ArrayList;

public class arrlist37 {

	//double type generics.
	public static void main(String[] args) {
		
		//one wrapper cannot hold other data type.
		//even if its lower value like primitive can hold.
		
		//create array list of double and store float in it.
		//compile error.
//		The method add(Double) in 
//		the type ArrayList<Double> is
//		not applicable for the arguments (float)
		ArrayList<Double> studentnames=new ArrayList<Double>();
		studentnames.add(10.34f);
		studentnames.add(15.67f);
		studentnames.add(20.67f);
		studentnames.add(30.34f);
		
		for(double e:studentnames) {
			System.out.println(e);
		}
	
	}

}















