package com.day16;

public class testbank17 {
	
	public static void main(String[] args) {
		
		bank17 obj = new bank17("manking", 20, "adhar", "phone");
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
		System.out.println(obj.getAdhar());
		System.out.println(obj.getPhone());
		
		//create another object with different values.
		
		bank17 obj1 = new bank17("vince macmahon", 10, "adhar", "phone");
		System.out.println(obj1.getName());
		System.out.println(obj1.getAge());
		System.out.println(obj1.getAdhar());
		System.out.println(obj1.getPhone());
	}

}


//manking
//20
//adhar
//phone

//vince macmahon
//10
//adhar
//phone
