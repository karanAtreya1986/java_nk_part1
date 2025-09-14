package com.day29;

import java.util.HashMap;

public class map18 {

	public static void main(String[] args) {

		//multiple blank key.
		HashMap<String, Object> h3= new HashMap<>();
		h3.put(null, null);
		h3.put(null, null);
		h3.put("", "karan");
		h3.put("", "jigar");
		h3.put("Tester1", " ");
		h3.put("karan", 34324);
		h3.put("james", 45.67f);
		h3.put("bond", true);
		h3.put("camila", "giraffe");
		h3.put("charles", 't');

		System.out.println(h3);
	}

}

//{null=null, =jigar, camila=giraffe, james=45.67, karan=34324, charles=t, Tester1= , bond=true}











