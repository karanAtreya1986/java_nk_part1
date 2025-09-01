package com.day14;

public class methodchain2 {
	
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
        //when in same class then no need of object creation.
        //even if we create no issues.
        methodchain2.t1();
    }	
    
    public static void t1() {
        System.out.println("t1 method");
        t2();
    }

    public static void t2() {
        System.out.println("t2 method");
        t3();
    }

    public static void t3() {
        System.out.println("t3 method");
    }
    
    public static void main(String[] args) {
		
    	methodchain2 m1=new methodchain2();
    	m1.m1();
	}
}

//m1 method
//m2 method
//m3 method
//t1 method
//t2 method
//t3 method

