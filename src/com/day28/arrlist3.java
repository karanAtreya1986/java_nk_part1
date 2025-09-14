package com.day28;

import java.util.ArrayList;

public class arrlist3 {
	
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
	
		//remove - pass index returns object.
		Object o1=a1.remove(0); //pass in index.
		System.out.println(o1); //100 - removed element seen.
		int size2=a1.size();
		System.out.println(size2);//3
	}

}

