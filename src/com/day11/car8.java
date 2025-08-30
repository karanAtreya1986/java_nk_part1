package com.day11;

public class car8 {
	
	String name;
	int price;
	String modelnumber;
	final static int wheels=4; //becomes constant cant be changed.
	
	//final applied on class variable.
	
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
        
        final int days=10;
        int totalsalary=days*1000;
        System.out.println(totalsalary);//10000
        
     
        


        
	}
	
	

}
