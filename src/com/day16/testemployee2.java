package com.day16;

public class testemployee2 {
	
	public static void main(String[] args) {
		
		employee2 e1=new employee2("karan", 40, 50000.0, true);
		System.out.println(e1.getAge() + " " + e1.getName() + " " + e1.getSalary() + " " + e1.getIsPermanent());
		
		e1.setSalary(332443.234324);
		System.out.println(e1.getAge() + " " + e1.getName() + " " + e1.getSalary() + " " + e1.getIsPermanent());
		
		e1.setIsPermanent(false);
		System.out.println(e1.getAge() + " " + e1.getName() + " " + e1.getSalary() + " " + e1.getIsPermanent());
	}

}

//40 karan 50000.0 true
//40 karan 332443.234324 true
//40 karan 332443.234324 false


