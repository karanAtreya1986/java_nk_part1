package com.day29;

import java.util.HashMap;

public class map1 {
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> h1= new HashMap<>();
		h1.put("chrome", 10);
		h1.put("firefox", 324324);
		
		System.out.println(h1);
		
		HashMap<Integer, Integer> h2= new HashMap<>();
		h2.put(2343, 34324);
		h2.put(32424, 3423423);
		
		System.out.println(h2);
		
		HashMap<String, Object> h3= new HashMap<>();
		h3.put("test", 34324);
		h3.put("karan", 25.78);
		h3.put("james", 45.67f);
		h3.put("bond", true);
		h3.put("camila", "giraffe");
		h3.put("charles", 't');
		
		System.out.println(h3);
	}

}
//{chrome=10, firefox=324324}
//{2343=34324, 32424=3423423}
//{test=34324, camila=giraffe, james=45.67, karan=25.78, charles=t, bond=true}