package com.day12;

public class customer3 {
	
	public int getcustomermarks(String name) {
		System.out.println("customer name is " + name);
		
		//use equals ignore case, best case for strings.
		//even more best is to use trim also.
		if(name.trim().equalsIgnoreCase("johny")) {
			return 80;
		}
		else if(name.trim().equalsIgnoreCase("rose")) {
			return 90;
		}
		else if(name.trim().equalsIgnoreCase("tiger")) {
			return 70;
		}
		else {
			System.out.println("pass right customer name");
			return -1; //best practice to return false or negative boolean when no condition match.
			//we can also return zero.
		}
	}
	
	public static void main(String[] args) {
		
		customer3 c=new customer3();
		int marks=c.getcustomermarks("johny");
		System.out.println(marks);
		
//pass different casing and check.
		customer3 c1=new customer3();
		int marks1=c1.getcustomermarks("ROse");
		System.out.println(marks1);
		
		//pass space at end of customer name.
		customer3 c2=new customer3();
		int marks2=c2.getcustomermarks("tiger ");
		System.out.println(marks2);
		
		//pass space at start of customer name.
		customer3 c3=new customer3();
		int marks3=c3.getcustomermarks(" tiger");
		System.out.println(marks3);
		
		//pass space in middle of customer name.
		customer3 c4=new customer3();
		int marks4=c4.getcustomermarks(" ti  ger ");
		System.out.println(marks4);
	}

}

//customer name is johny
//80
//customer name is ROse
//90
//customer name is tiger 
//70
//customer name is  tiger
//70
//customer name is  ti  ger 
//pass right customer name
//-1




