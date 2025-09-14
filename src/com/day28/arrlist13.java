package com.day28;

import java.util.ArrayList;

public class arrlist13 {

	//object type generics.
	public static void main(String[] args) {

		//can store any data type.
		//object type generics.
		ArrayList<Object> a1=new ArrayList<Object>();
		a1.add(56.87);
		a1.add(20);
		a1.add('t');
		a1.add(true);
		a1.add("tiger");
		System.out.println(a1);

	}

}

//[56.87, 20, t, true, tiger]







