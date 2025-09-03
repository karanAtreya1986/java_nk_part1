package com.day15;

public class chain3 {
	
	public void m1() {
		int d=12;
		System.out.println("m1 method");
		m2();
	}
	
	public void m2() {
		int g=90;
		System.out.println("m2 method");
		m3();
		System.out.println("byee");
	}
	
	public void m3() {
		int k=5;
		System.out.println("m3 method");
		//m1
	}
	
	public static void main(String[] args) {
		
		int p=10;
		
		chain3 c1=new chain3();
		c1.m1();
	}

}

//m1 method
//m2 method
//m3 method
//byee

