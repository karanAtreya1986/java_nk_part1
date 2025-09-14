package com.day28;

import java.util.ArrayList;

public class arrlist12 {

//	Generics.
//	Cant add any other value.
	public static void main(String[] args) {

		//Different types of generics.
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(34234);
		a1.add(20);
		System.out.println(a1);
		
		ArrayList<Double> a2=new ArrayList<Double>();
		a2.add(34234.3245435);
		a2.add(20.54578);
		System.out.println(a2);
		
		ArrayList<String> a3=new ArrayList<String>();
		a3.add("lion");
		a3.add("gorialla@#$324");
		System.out.println(a3);
		
	}

}

//[34234, 20]
//[34234.3245435, 20.54578]
//[lion, gorialla@#$324]






