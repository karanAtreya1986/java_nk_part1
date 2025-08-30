package com.day11;

public class user1 {
	
	    String name;
	    int age;
	    String city;

	    public static void main(String[] args) {
	        // create three objects of User
	    	user1 user1 = new user1();
	    	user1 user2 = new user1();
	    	user1 user3 = new user1();

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

	        // print the values
	        System.out.println("User 1:");
	        System.out.println("Name: " + user1.name);
	        System.out.println("Age: " + user1.age);
	        System.out.println("City: " + user1.city);

	        System.out.println("\nUser 2:");
	        System.out.println("Name: " + user2.name);
	        System.out.println("Age: " + user2.age);
	        System.out.println("City: " + user2.city);

	        System.out.println("\nUser 3:");
	        System.out.println("Name: " + user3.name);
	        System.out.println("Age: " + user3.age);
	        System.out.println("City: " + user3.city);
	    
	}

}

//User 1:
//Name: John Doe
//Age: 25
//City: New York
//
//User 2:
//Name: Jane Smith
//Age: 30
//City: Los Angeles
//
//User 3:
//Name: Bob Johnson
//Age: 35
//City: Chicago

