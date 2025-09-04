package com.day16;

public class testbank18 {
	
	public static void main(String[] args) {
		
		bank18 obj = new bank18("manking", 20, "adhar", "phone");
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
		System.out.println(obj.getAdhar());
		System.out.println(obj.getPhone());
		obj.openaccount();
		
		//create another object with different values.
		
		bank18 obj1 = new bank18("vince macmahon", 10, "adhar", "phone");
		System.out.println(obj1.getName());
		System.out.println(obj1.getAge());
		System.out.println(obj1.getAdhar());
		System.out.println(obj1.getPhone());
		obj1.openaccount();
	}

}


//manking
//20
//adhar
//phone
//you can open account
//vince macmahon
//10
//adhar
//phone
//you cannot open account

