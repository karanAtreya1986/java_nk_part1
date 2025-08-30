package com.day6;

public class while10 {
	
	public static void main(String[] args) {
		
		//increment it before going inside if loop.
		
		int p=1;
		while(p<=50) {
			System.out.println(p);
			p++;
			if(p==5) {
				System.out.println("byee");
				break;
			}
		}


}
}

//1
//2
//3
//4
//byee
