package com.day14;

public class overload2 {
	
	public void m1(int a , String b) {
		System.out.println(a+b);
	}
	
	//overload method.
	//return type doesnt matter.
	public int m1(String a, int b) {
		System.out.println(a);
		return 1;
	}
	
	//overload method.
		//return type doesnt matter.
	public double m1(int b) {
		System.out.println(b);
		return 10.78;
	}
	
	//below will give error.
	//Duplicate method m1(int) in type overload1
//	private void m1(int a) {
//		System.out.println(a);
//	}
	
	//even public private doesnt matter for overloading.
	private void m1(int test, String test1, char test2) {
	System.out.println(test+test1+test2);
}
	
	//now the private is used so warning is gone above private.
	public void m1() {
		m1(10, "test", 'c');
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
