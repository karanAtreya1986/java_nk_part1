package com.day12;

public class function2 {
	
	public void calc() {
	    System.out.println("calc method");
	    int a = 10;
	    int b = 20;
	    int c = a + b;
	    System.out.println(c); // 30
	}
	
	public static void main(String[] args) {
		
		function2 f2=new function2();
		f2.calc();
	}

}

//calc method
//30
