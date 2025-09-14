package com.day28;

import java.util.ArrayList;

public class arrlist35 {

	//double type generics.
	public static void main(String[] args) {
		
		//one wrapper cannot hold other data type.
		//even if its lower value like primitive can hold.
		
		//create array list of double and store int.
		//compile error.
		//The method add(int, Double) in the type ArrayList<Double> 
		//is not applicable for the arguments (int)
		ArrayList<Double> studentnames=new ArrayList<Double>();
		studentnames.add(10);
		studentnames.add(15);
		studentnames.add(20);
		studentnames.add(30);
		
		for(double e:studentnames) {
			System.out.println(e);
		}
	
	}

}















