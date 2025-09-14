package com.day28;

import java.util.ArrayList;

public class arrlist10 {

//	Generics.
//	Cant add any other value.
	public static void main(String[] args) {

		
		
		//Wrapper classes can contain only the data which it can hold. (1.42)
		//Example in primitive double can hold int also (lower values).
		//In wrapper, Double cannot hold int, compile error.

		//ArrayList<DoubLe> cannot be resolved to a type
		ArrayList<Double> a1=new ArrayList<Double>();
		a1.add(100.3434);
		a1.add(545);
		//The method add(int, Double) in the type ArrayList<Double> 
		//is not applicable for the arguments (int)
		
		System.out.println(a1);
		
	}

}





