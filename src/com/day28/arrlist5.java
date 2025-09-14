package com.day28;

import java.util.ArrayList;

public class arrlist5 {

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

		//print complete array list.
		System.out.println(a1);
	}

}

//0
//2
//4
//[100, 200, 300, 400]

