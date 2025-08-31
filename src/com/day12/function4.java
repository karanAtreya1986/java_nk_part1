package com.day12;

public class function4 {
	
	//no input but returns.
	
	public int getnumber() {
		System.out.println("get number method");
		int fee=10;
		int tax=20;
		int totalfee=fee+tax;
		return totalfee;
	}
	
	//Not good practice to use the print the values directly.
	//Good practice to store in variables. Useful for manipulating.

	public static void main(String[] args) {
		
		function3 f3=new function3();
		int totalfee1=f3.getnumber();
		System.out.println(totalfee1-100+300.50);
	}

}

//get number method
//230.5


