package com.day28;

import java.util.ArrayList;

public class arrlist6 {

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

		//try accessing from index not present.
		//out of bounds exception.
		Object object = a1.get(101);
		System.out.println(object);
	}

}

//0
//2
//4
//Exception in thread "main" java.lang.IndexOutOfBoundsException: 
//	Index 101 out of bounds for length 4
//	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
//	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
//	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
//	at java.base/java.util.Objects.checkIndex(Objects.java:365)
//	at java.base/java.util.ArrayList.get(ArrayList.java:428)
//	at com.day28.arrlist6.main(arrlist6.java:22)


