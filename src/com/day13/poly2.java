package com.day13;

public class poly2 {
	
//	Also known as polymorphism.
//	Poly means many.
//	Morphism means different forms.
//	Within same class.


	public int test() {
		return 100;
	}
	
	public double test(int a) {
		return 12.35;
	}
	
	
	public void test(String a) {
		
	}
	
	public void test(String a,String b) {
		
	}
	
	public void test(String a,int b) {
		
	}
	
	public int test(int a,String b) {
		return 100;
	}
	
	public static void main(String[] args) {
		poly2 p1=new poly2();
		System.out.println(p1.test(90));
	}
	
	
}

//12.35

