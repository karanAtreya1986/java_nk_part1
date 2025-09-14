package com.day29;

import java.util.HashMap;

public class map20 {

	public static void main(String[] args) {

		//key and value blank.
		//duplicates.
		HashMap<String, Object> h3= new HashMap<>();
		h3.put(null, null);
		h3.put(null, null);
		h3.put("", "");
		h3.put("", "");
		

		System.out.println(h3);
	}

}

//{null=null, =}













