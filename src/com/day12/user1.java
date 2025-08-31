package com.day12;

public class user1 {
	
	String name;
    int age;
    String city;
	
	    public static void main(String[] args) {

	    	user1 u1 = new user1();
	        u1.name = "Veena";
	        u1.age = 30;
	        u1.city = "Pune";

	        user1 u2 = new user1();
	        u2.name = "Piyush";
	        u2.age = 35;
	        u2.city = "Bangalore";

	        user1 u3 = new user1();
	        u3.name = "Suma";
	        u3.age = 40;
	        u3.city = "LA";

	        System.out.println(u1.name + " " + u1.age + " " + u1.city);
	        System.out.println(u2.name + " " + u2.age + " " + u2.city);
	        System.out.println(u3.name + " " + u3.age + " " + u3.city);

	        System.out.println("-----------");

	        u1 = u2 = u3;

	        System.out.println(u1.name + " " + u1.age + " " + u1.city);
	        System.out.println(u2.name + " " + u2.age + " " + u2.city);
	        System.out.println(u3.name + " " + u3.age + " " + u3.city);
	    }
	}

//Veena 30 Pune
//Piyush 35 Bangalore
//Suma 40 LA
//-----------
//Suma 40 LA
//Suma 40 LA
//Suma 40 LA

