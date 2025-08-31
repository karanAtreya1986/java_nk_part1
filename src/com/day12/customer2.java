package com.day12;

public class customer2 {
	
	public int getcustomermarks(String name) {
		System.out.println("customer name is " + name);
		
		//use equals ignore case, best case for strings.
		if(name.equalsIgnoreCase("johny")) {
			return 80;
		}
		else if(name.equalsIgnoreCase("rose")) {
			return 90;
		}
		else if(name.equalsIgnoreCase("tiger")) {
			return 70;
		}
		else {
			System.out.println("pass right customer name");
			return -1; //best practice to return false or negative boolean when no condition match.
			//we can also return zero.
		}
	}
	
	public static void main(String[] args) {
		
		customer2 c=new customer2();
		int marks=c.getcustomermarks("johny");
		System.out.println(marks);
		
//pass different casing and check.
		customer2 c1=new customer2();
		int marks1=c1.getcustomermarks("ROse");
		System.out.println(marks1);
		
		//pass space at end of customer name.
		customer2 c2=new customer2();
		int marks2=c2.getcustomermarks("tiger ");
		System.out.println(marks2);
	}

}

//customer name is johny
//80
//customer name is ROse
//90
//customer name is tiger 
//pass right customer name
//-1


