package com.day28;

import java.util.ArrayList;

public class arrlist33 {

	//integer type generics.
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
		
		//To get values we can use primitive types
		//where applicable but not good practice.
		//we get errors when value is null.
		//null is not primitive.
		for(int e:studentnames) {
			System.out.println(e);
		}
	
	}

}

//10
//15
//20
//30
//Exception in thread "main" java.lang.NullPointerException: 
//	Cannot invoke "java.lang.Integer.intValue()" 
//	because the return value of "java.util.Iterator.next()" is null
//	at com.day28.arrlist33.main(arrlist33.java:23)














