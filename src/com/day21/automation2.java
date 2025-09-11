package com.day21;

public interface automation2 {
	
	int time=10;
	
	default String billing(int a) {
		System.out.println("billing in interface");
		return "a"+a; //i learnt another way to return one string.
	}

}
