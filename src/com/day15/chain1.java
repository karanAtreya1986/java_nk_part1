package com.day15;

public class chain1 {
	
	public void m1() {
		System.out.println("m1 method");
		m2();
	}
	
	public void m2() {
		System.out.println("m2 method");
		m3();
	}
	
	public void m3() {
		System.out.println("m3 method");
	}
	
	public static void main(String[] args) {
		
		chain1 c1=new chain1();
		c1.m1();
	}

}

//m1 method
//m2 method
//m3 method
