package com.day24;

public class bmw2  extends car2{
	
	//public methods can be overridden.
	@Override
	public String billing(int a) {
		System.out.println("bmw billing method");
		return "bmw billing method";
	}
}
