package com.day28;

import java.util.ArrayList;

public class arrlist4 {

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

		//pass index and get the value.

		Object object = a1.get(2);
		System.out.println(object);
	}

}

//0
//2
//4
//300

