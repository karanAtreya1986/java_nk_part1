package com.day14;

public class callby3 {
	
public void m1(int a) {
	System.out.println(a);
}

public static void t1(callby3 p1) {
	p1.m1(40);
}

public static void main(String[] args) {
	callby3 c1=new callby3();
	c1.m1(10); //call by value or argument.
	
	//in call by reference we can only pass the reference or object not primitive.
	callby3.t1(100); //The method t1(callby3) in the type callby3 is not applicable for the arguments (int)
}


}



