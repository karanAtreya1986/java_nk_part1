package com.day28;

import java.util.ArrayList;

public class arrlist29 {

	//Boolean type generics.
	public static void main(String[] args) {
		
		
		ArrayList<Boolean> studentnames=new ArrayList<Boolean>();
		studentnames.add(true);
		studentnames.add(false);
		//add null
		//allowed
		studentnames.add(null);
		studentnames.add(null);
		studentnames.add(0,false); //overwrites first value.
		studentnames.add(5,true);
		studentnames.set(1, false);
		studentnames.add(" ");
		//The method add(Boolean) in the type ArrayList<Boolean> 
		//is not applicable for the arguments (String)
		studentnames.add("");
		//The method add(Boolean) in the type ArrayList<Boolean> 
		//is not applicable for the arguments (String)
		
		
		
		System.out.println(studentnames);
	
	}

}






















