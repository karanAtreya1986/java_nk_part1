package com.day24;

//class need not be given any access modifier its ok.
 class bmw17  extends car3{

	public static void main(String[] args) {

		
		bmw17 b1=new bmw17();
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

//0
//child class bmw billing method 10
//billing method







