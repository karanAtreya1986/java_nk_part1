package com.day28;

import java.util.ArrayList;

public class arrlist34 {

	//integer type generics.
	public static void main(String[] args) {
		
		ArrayList<Integer> studentnames=new ArrayList<Integer>();
		studentnames.add(10);
		studentnames.add(15);
		studentnames.add(20);
		studentnames.add(30);
		
		//cannot print null values when using int.
		for(int e:studentnames) {
			System.out.println(e);
		}
	
	}

}

//10
//15
//20
//30















