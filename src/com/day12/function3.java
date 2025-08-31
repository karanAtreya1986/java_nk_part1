package com.day12;

public class function3 {
	
	//no input but returns.
	
	public int getnumber() {
		System.out.println("get number method");
		int fee=10;
		int tax=20;
		int totalfee=fee+tax;
		return totalfee;
	}
	
	public static void main(String[] args) {
		
		function3 f3=new function3();
		int totalfee1=f3.getnumber();
		System.out.println(totalfee1);
	}

}

//get number method
//30

