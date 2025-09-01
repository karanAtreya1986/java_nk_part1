package com.day14;

public class callby2 {
	
public void m1(int a) {
	System.out.println(a);
}

public static void t1(callby2 p1) {
	p1.m1(40);
}

public static void main(String[] args) {
	callby2 c1=new callby2();
	c1.m1(10); //call by value or argument.
	
	callby2.t1(c1); //call by reference.
}


}

//10
//40

