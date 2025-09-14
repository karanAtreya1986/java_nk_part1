package com.day29;

import java.util.HashMap;

public class map10 {
	
	public static void main(String[] args) {
		
		//multiple null value allowed.
		HashMap<String, Object> h3= new HashMap<>();
		h3.put("test", null);
		h3.put("test1234", null);
		h3.put("karan", 34324);
		h3.put("james", 45.67f);
		h3.put("bond", true);
		h3.put("camila", "giraffe");
		h3.put("charles", 't');
		
		System.out.println(h3);
	}

}

//{test1234=null, test=null, camila=giraffe, james=45.67, karan=34324, charles=t, bond=true}






