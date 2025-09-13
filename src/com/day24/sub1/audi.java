package com.day24.sub1;

public class audi extends car6{
	
	public static void main(String[] args) {
		
		//car6 cannot be resolved to a type
		//protected constructor not accesible outside package.
		car6 c6=new car6("tiger", 10000, "red", "1234");
		
	}

}
