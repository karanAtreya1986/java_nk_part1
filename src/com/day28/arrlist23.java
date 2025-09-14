package com.day28;

import java.util.ArrayList;

public class arrlist23 {

	//Character type generics.
	public static void main(String[] args) {
		
		//null allowed in character also.
		ArrayList<Character> studentnames=new ArrayList<Character>();
		studentnames.add('a');
		studentnames.add('%');
		studentnames.add('t');
		studentnames.add('R');
		//add null
		//allowed
		studentnames.add(null);
		studentnames.add(null);
		
		System.out.println(studentnames);
	
	}

}

//[a, %, t, R, null, null]















