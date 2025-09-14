package com.day28;

import java.util.ArrayList;

public class arrlist32 {

	//Integer type generics.
	public static void main(String[] args) {
		
		//null allowed in integer also.
		ArrayList<Integer> studentnames=new ArrayList<Integer>();
		studentnames.add(10);
		studentnames.add(15);
		studentnames.add(20);
		studentnames.add(30);
		//add null
		//allowed
		studentnames.add(null);
		studentnames.add(null);
		
		//iterate using for each in integer.
		for(Integer e:studentnames) {
			System.out.println(e);
		}
	
	}

}

//10
//15
//20
//30
//null
//null













