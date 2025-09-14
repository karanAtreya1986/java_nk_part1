package com.day29;

import java.util.HashMap;

public class map8 {
	
	public static void main(String[] args) {
		
		//null key allowed.
		//duplicate null key allowed.
		HashMap<String, Object> h3= new HashMap<>();
		h3.put(null, 34324);
		h3.put(null, 34234.434543);
		h3.put("test", 34324);
		h3.put("karan", 34324);
		h3.put("james", 45.67f);
		h3.put("bond", true);
		h3.put("camila", "giraffe");
		h3.put("charles", 't');
		
		System.out.println(h3);
	}

}

//{null=34234.434543, test=34324, camila=giraffe, james=45.67, karan=34324, charles=t, bond=true}




