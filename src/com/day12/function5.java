package com.day12;

public class function5 {
	
	public String gettrainname() {
		System.out.println("get train name method");
		return "karan";
	}
	
	public static void main(String[] args) {
		
		function5 f5=new function5();
		String trainname=f5.gettrainname();
		System.out.println(trainname);
	}

}

//get train name method
//karan

