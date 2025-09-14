package com.day28;

import java.util.ArrayList;

public class arrlist27 {

	//Boolean type generics.
	public static void main(String[] args) {
		
		//add from existing or sequential index
		ArrayList<Boolean> studentnames=new ArrayList<Boolean>();
		studentnames.add(true);
		studentnames.add(false);
		//add null
		//allowed
		studentnames.add(null);
		studentnames.add(null);
		studentnames.add(0,false); //overwrites first value.
		studentnames.add(5,true);
		
		
		System.out.println(studentnames);
	
	}

}

//[false, true, false, null, null, true]



















