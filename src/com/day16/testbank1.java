package com.day16;

public class testbank1 {
	
	public static void main(String[] args) {
		
		bank1 b1=new bank1();
		b1.setAge(15);
		b1.setName("karan");
		
		//print name and age in one line.
		
		System.out.println(b1.getName()+" "+b1.getAge());
		
		//create another object.
		//different age greater than 16 years.
		//different name.
		
		bank1 b2=new bank1();
		b2.setAge(20);
		b2.setName("tiger");
		
		System.out.println(b2.getName()+" "+b2.getAge());
	}

}

//grow up to 16 years
//karan 0
//hello olders
//tiger 20

