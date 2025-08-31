package com.day13;

public class poly3 {
	
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
	
	public void search() {
		
	}
	
	public void search(String name) {
		
	}
	
	public void search(String name,String color) {
		
	}
	
	public void search(String name,String color, int price) {
		System.out.println("name is " + name + " color is " + color + " price is " + price);
	}
	
	public static void main(String[] args) {
		poly3 p1=new poly3();
		p1.test("karan",32432);
		p1.search("karan","red",324343432);
		System.out.println(p1.test(90));
	}
	
	
}

//name is karan color is red price is 324343432
//12.35


