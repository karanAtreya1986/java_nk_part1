package com.day6;

public class while7 {
	
	public static void main(String[] args) {
		
//while with if and break.
//		Break can be used inside if, if the if itself is under some loop.
//		Break breaks loop not conditional statements.
		
		int p=1;
		while(p<=50) {
			System.out.println(p);
			if(p==5) {
				System.out.println("byee");
				break;
			}
			p++;
		}


}
}

//1
//2
//3
//4
//5
//byee
