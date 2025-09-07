package com.day18;

public class testfor9 {
	
	public static void main(String[] args) {
		
		bmw9 b1=new bmw9();
		String s1=b1.type;
		System.out.println(s1); //bmw CLASs

		//called from same child class, if the child has the variable.
		
		//create object of car9 class.
		car9 c1=new car9();
		String s2=c1.type;
		System.out.println(s2); //Car CLASs
		//called from car class as it has the variable.
		
		//create object of vehicle9 class.
		vehicle9 v1=new vehicle9();
		String s3=v1.type;
		System.out.println(s3); //Generic Vehicle
		//called from vehicle class as it has the variable.
	}

}
