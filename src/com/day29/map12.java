package com.day29;

import java.util.HashMap;

public class map12 {
	
	public static void main(String[] args) {
		
		//key and value null.
		//multiple key null and multiple value null.
		HashMap<String, Object> h3= new HashMap<>();
		h3.put(null, null);
		h3.put(null, null);
		h3.put("karan", 34324);
		h3.put("james", 45.67f);
		h3.put("bond", true);
		h3.put("camila", "giraffe");
		h3.put("charles", 't');
		
		System.out.println(h3);
	}

}

//{null=null, camila=giraffe, james=45.67, karan=34324, charles=t, bond=true}








