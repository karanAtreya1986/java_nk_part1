package com.day28;

import java.util.ArrayList;

public class arrlist7 {

	public static void main(String[] args) {

		ArrayList a1=new ArrayList();
		int i1=a1.size();
		System.out.println(i1);//0
		a1.add(100);
		a1.add(200);
		int size = a1.size();
		System.out.println(size); //2

		a1.add(300);
		a1.add(400);
		int size1=a1.size();
		System.out.println(size1); //4

		//print values one by one.
		for(int i=0;i<a1.size();i++) {
			System.out.println(a1.get(i));
		}
	}

}

//0
//2
//4
//100
//200
//300
//400



