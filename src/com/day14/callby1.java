package com.day14;

public class callby1 {
	
public void m1(int a) {
	System.out.println(a);
}

public static void main(String[] args) {
	callby1 c1=new callby1();
	c1.m1(10); //call by value or argument.
}
//10

}
