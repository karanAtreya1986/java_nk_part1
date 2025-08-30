package com.day11;

public class car5 {
	
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
        
      //change static variable value
        car5.wheels=2423434;
        System.out.println(c1.name + " "+ c1.modelnumber + " " + c1.price + " " +car5.wheels);
        //Toyota T123 20000 2423434


        
	}
	
	

}
