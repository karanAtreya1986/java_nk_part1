package com.day28;

import java.util.ArrayList;

public class arrlist25 {

	//Boolean type generics.
	public static void main(String[] args) {
		
		//null allowed in boolean also.
		ArrayList<Boolean> studentnames=new ArrayList<Boolean>();
		studentnames.add(true);
//		studentnames.add(True);//True cannot be resolved to a variable
//		studentnames.add(False);//False cannot be resolved to a variable
//		studentnames.add(TRUE);//TRUE cannot be resolved to a variable
//		studentnames.add(FALSE);//FALSE cannot be resolved to a variable
		studentnames.add(false);
		//add null
		//allowed
		studentnames.add(null);
		studentnames.add(null);
		
		System.out.println(studentnames);
	
	}

}

//[true, false, null, null]

















