package com.day28;

import java.util.ArrayList;

public class arrlist28 {

	//Boolean type generics.
	public static void main(String[] args) {
		
		//use set to update values.
		//add index also does update.
		//for naveen it was not.
		
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
		
		
		System.out.println(studentnames);
	
	}

}

//[false, false, false, null, null, true]





















