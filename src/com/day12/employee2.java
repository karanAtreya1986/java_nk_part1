package com.day12;

public class employee2 {
	
	    String name;
	    int salary;

	    public static void main(String[] args) {
	        // TODO Auto-generated method stub

	    	employee2 e1 = new employee2();
	        e1.salary = 100;

	        employee2 e2 = new employee2();
	        e2.salary = 200;

	        employee2 e3 = new employee2();
	        e3.salary = 300;

	        employee2 e4 = new employee2();
	        e4.salary = 400;
	        
	        //update salary and print.
	        e1.salary = 1000;

	        System.out.println(e1.salary + e2.salary + e3.salary + e4.salary);
	    }
	    
}

//1900




