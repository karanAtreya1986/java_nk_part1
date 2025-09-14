package com.day28;

import java.util.ArrayList;

public class arrlist26 {

	//Boolean type generics.
	public static void main(String[] args) {
		
		//order based collection.
		//cant randomly add at any index.
		ArrayList<Boolean> studentnames=new ArrayList<Boolean>();
		studentnames.add(true);
		studentnames.add(false);
		//add null
		//allowed
		studentnames.add(null);
		studentnames.add(null);
		studentnames.add(10,false);
		
		System.out.println(studentnames);
	
	}

}

//Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 10, Size: 4
//at java.base/java.util.ArrayList.rangeCheckForAdd(ArrayList.java:839)
//at java.base/java.util.ArrayList.add(ArrayList.java:511)
//at com.day28.arrlist26.main(arrlist26.java:19)


















