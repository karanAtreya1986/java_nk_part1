package com.day28;

import java.util.ArrayList;

public class arrlist14 {

	//object type generics.
	public static void main(String[] args) {

//for each loop to print.
		ArrayList<Object> a1=new ArrayList<>();
		a1.add(56.87);
		a1.add(20);
		a1.add('t');
		a1.add(true);
		a1.add("tiger");
		
		for(Object e:a1) {
			System.out.println(e);
		}
	}

}

//56.87
//20
//t
//true
//tiger








