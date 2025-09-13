package com.day24;

public class bmw12  extends car2{

	public static void main(String[] args) {

		
		bmw12 b1=new bmw12();
		int s1=b1.price;
		System.out.println(s1);
		String s2=b1.billing(10);
		System.out.println(s2);
		
	}
	
	//public can be overriden in child by public.
	@Override
	public String billing(int a) {
		System.out.println("child class bmw billing method " +a);
		return "billing method";
	}
	
}

//0
//child class bmw billing method 10
//billing method




