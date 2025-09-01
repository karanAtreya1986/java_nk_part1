package com.day14;

public class callby5 {
	
	//complex program.
	
	String name;
    int age;

    public void m1(int a) {
        System.out.println(a);
    }	
    
    public static void t1(callby5 p1) {
        p1.m1(20);
        System.out.println(p1.name);
        System.out.println(p1.age);
        
        p1.name="harry";
        p1.age=23434;
    }

	public static void main(String[] args) {
		callby5 c1=new callby5();
		c1.name="tiger";
		c1.age=10;
		
		callby5.t1(c1); //call by reference.
		
		System.out.println("print from main method");
		System.out.println(c1.name);
		System.out.println(c1.age);

	}

}


//20
//tiger
//10
//print from main method
//harry
//23434
