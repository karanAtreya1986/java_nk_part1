package com.day11;

public class car4 {
	
	String name;
	int price;
	String modelnumber;
	static int wheels=4;
	
	public static void main(String[] args) {
		
		// create three objects of car1
        car1 c1 = new car1();
        car1 c2 = new car1();
        car1 c3 = new car1();

        // assign values to the objects
        c1.name = "Toyota";
        c1.price = 20000;
        c1.modelnumber = "T123";
 
        c2.name = "Honda";
        c2.price = 25000;
        c2.modelnumber = "H456";
        
        c3.name = "Ford";
        c3.price = 30000;
        c3.modelnumber = "F789";
        
        //access static variables using class name.
        System.out.println(car2.wheels); //4
        
       //access non static using object name.
        System.out.println(c1.name + " " + c1.name + " " +c1.modelnumber);//Toyota Toyota T123
        
        //can directly access static variables without class name also.
        System.out.println(wheels);//4
        
        //try accessing static using object name
        System.out.println(c1.wheels);//4
        //but warning -- The static field car1.wheels should be accessed in a static way
        
        System.out.println(c1.name + " " + c1.name + " " +c1.modelnumber + " " + car4.wheels);
        //Toyota Toyota T123 4

        
	}
	
	

}
