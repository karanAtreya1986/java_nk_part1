package com.day14;

public class callby4 {
	
	String name;
    int age;

    public void m1(int a) {
        System.out.println(a);
    }	
    
    public static void t1(callby4 p1) {
        p1.m1(20);
        System.out.println(p1.name);
        System.out.println(p1.age);
    }

	public static void main(String[] args) {
		callby4 c1=new callby4();
		c1.name="tiger";
		c1.age=10;
		
		callby4.t1(c1); //call by reference.

	}

}


//20
//tiger
//10
