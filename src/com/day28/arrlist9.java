package com.day28;

import java.util.ArrayList;

public class arrlist9 {

//	Generics.
//	Cant add any other value.
	public static void main(String[] args) {

		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(100);
		a1.add("testing");
		//The method add(Integer) in the type ArrayList<Integer> 
		//is not applicable for the arguments (String)
		
		System.out.println(a1);
		
	}

}





