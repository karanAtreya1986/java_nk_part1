package com.day28;

import java.util.ArrayList;

public class arrlist16 {

	//object type generics.
	public static void main(String[] args) {

//		Right side is not mandatory but if we write no harm
		ArrayList<Object> a1=new ArrayList<>();
		a1.add(56.87);
		a1.add(20);
		a1.add('t');
		a1.add(true);
		a1.add("tiger");
		System.out.println(a1);

	}

}

//[56.87, 20, t, true, tiger]







