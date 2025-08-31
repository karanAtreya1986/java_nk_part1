package com.day12;

public class customer4 {
	
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
		
		customer4 c=new customer4();
		int marks=c.getcustomermarks("johny");
		System.out.println(marks);
		
//		How to use the returned variables
		if(marks>0) {
			System.out.println("pass the marks");
		}
		else {
			System.out.println("fail the marks");
		}
	}
}

//customer name is johny
//80
//pass the marks




