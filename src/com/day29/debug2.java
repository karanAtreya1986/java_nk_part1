package com.day29;

import java.util.HashMap;

public class debug2 {

	public static void main(String[] args) {

		//create hashmap to check the hash code.
		//put debugger and then run as debug.
		//switch perspective and you can see the hash code.
		//add null, it wont have hashcode as it will go in first place.
		HashMap<String, Object> h3= new HashMap<>();
		h3.put("test", 34324);
		h3.put("karan", 25.78);
		h3.put("james", 45.67f);
		h3.put("bond", true);
		h3.put("camila", "giraffe");
		h3.put("charles", 't');
		h3.put(null, 't');

		System.out.println(h3);
	}

}
