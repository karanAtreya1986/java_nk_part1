package com.day24;

public class bmw14  extends car2{

	public static void main(String[] args) {

		
		bmw14 b1=new bmw14();
		int s1=b1.price;
		System.out.println(s1);
		String s2=b1.billing(10);
		System.out.println(s2);
		
	}

	//public cannot become default in child.
	//Cannot reduce the visibility of the inherited method from car2
	@Override
	 String billing(int a) {
		System.out.println("child class bmw billing method " +a);
		return "billing method";
	}
	
}






