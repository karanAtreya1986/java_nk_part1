package com.day29;

import java.util.HashMap;

public class map4 {
	
	public static void main(String[] args) {
		
		//duplicate key allowed.
		//latest value overrides all.
		HashMap<String, Object> h3= new HashMap<>();
		h3.put("test", 34324);
		h3.put("test", 23432.32432);
		h3.put("karan", 25.78);
		h3.put("james", 45.67f);
		h3.put("bond", true);
		h3.put("camila", "giraffe");
		h3.put("charles", 't');
		
		System.out.println(h3);
	}

}

//{test=23432.32432, camila=giraffe, james=45.67, karan=25.78, charles=t, bond=true}
