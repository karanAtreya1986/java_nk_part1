package com.day11;

public class user4 {
	
	    String name;
	    int age;
	    String city;

	    public static void main(String[] args) {
	        // create three objects of User
	    	user4 user1 = new user4();
	    	user4 user2 = new user4();
	    	user4 user3 = new user4();

	        // assign values to the objects
	        user1.name = "John Doe";
	        user1.age = 25;
	        user1.city = "New York";

	        user2.name = "Jane Smith";
	        user2.age = 30;
	        user2.city = "Los Angeles";

	        user3.name = "Bob Johnson";
	        user3.age = 35;
	        user3.city = "Chicago";
	        
	        user1=user2; //user 1 and user 2 point to same object.
	        user2=user3; //user 2 and user 3 point to same object.
	        user3=user1; //user 3 and user 1 point to same object.
	        //In java one object can have multiple references.
	        
	        System.out.println(user1.name);
	        System.out.println(user1.age);
	        System.out.println(user1.city);
	        System.out.println(user2.name);
	        System.out.println(user2.age);
	        System.out.println(user2.city);
	        System.out.println(user3.name);
	        System.out.println(user3.age);
	        System.out.println(user3.city);

	     
	}

}

//Jane Smith
//30
//Los Angeles
//Bob Johnson
//35
//Chicago
//Jane Smith
//30
//Los Angeles



