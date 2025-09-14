package com.day29;

import java.util.HashMap;

public class map3 {
	
	public static void main(String[] args) {
		
		
		//use get to get the value from key which doesnt exist.
		
		HashMap<String, Object> h3= new HashMap<>();
		h3.put("test", 34324);
		h3.put("karan", 25.78);
		h3.put("james", 45.67f);
		h3.put("bond", true);
		h3.put("camila", "giraffe");
		h3.put("charles", 't');
		
		Object object = h3.get("bonererd");
		System.out.println(object);
	}

}

//null