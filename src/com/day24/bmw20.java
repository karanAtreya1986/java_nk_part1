package com.day24;

//Syntax error on token "default", delete this token
//class can be public abstract or final only.
 default class bmw20  extends car3{

	public static void main(String[] args) {

		
		bmw20 b1=new bmw20();
		int s1=b1.price;
		System.out.println(s1);
		String s2=b1.billing(10);
		System.out.println(s2);
		
	}

	//public can override the public from parent class.
	@Override
	public String billing(int a) {
		System.out.println("child class bmw billing method " +a);
		return "billing method";
	}
	
}







