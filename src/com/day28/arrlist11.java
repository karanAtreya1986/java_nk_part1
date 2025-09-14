package com.day28;

import java.util.ArrayList;

public class arrlist11 {

//	Generics.
//	Cant add any other value.
	public static void main(String[] args) {

		ArrayList<String> a1=new ArrayList<String>();
		a1.add("tiger");
		a1.add(32424);
		//The method add(int, String) in the type ArrayList<String> 
		//is not applicable for the arguments (int)
		System.out.println(a1);
		
	}

}





