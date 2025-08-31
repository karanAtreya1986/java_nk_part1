package com.day12;

public class customer1 {
	
	public int getcustomermarks(String name) {
		System.out.println("customer name is " + name);
		
		if(name.equals("johny")) {
			return 80;
		}
		else if(name.equals("rose")) {
			return 90;
		}
		else if(name.equals("tiger")) {
			return 70;
		}
		else {
			System.out.println("pass right customer name");
			return -1; //best practice to return false or negative boolean when no condition match.
			//we can also return zero.
		}
	}
	
	public static void main(String[] args) {
		
		customer1 c=new customer1();
		int marks=c.getcustomermarks("johny");
		System.out.println(marks);
		
//pass invalid name and check output.
		customer1 c1=new customer1();
		int marks1=c1.getcustomermarks("jane");
		System.out.println(marks1);
	}

}

//customer name is johny
//80

//customer name is jane
//pass right customer name
//-1

