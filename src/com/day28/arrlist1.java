package com.day28;

import java.util.ArrayList;

public class arrlist1 {
	
	public static void main(String[] args) {
		
		ArrayList a1=new ArrayList();
		int i1=a1.size();
		System.out.println(i1);//0
		a1.add(100);
		a1.add(200);
		int size = a1.size();
		System.out.println(size);
		
		a1.add(300);
		a1.add(400);
		int size1=a1.size();
		System.out.println(size1);
		
		//add returns true or false.
		boolean b1=a1.add(500);
		System.out.println(b1);//true
	}

}
//2
//4
