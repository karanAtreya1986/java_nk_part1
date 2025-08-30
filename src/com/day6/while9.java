package com.day6;

public class while9 {
	
	public static void main(String[] args) {
		
//while with if and without break.
//		without break.
		//when we write the counter inside if block wont work.
		//counter has to be for while block.
		
		int p=1;
		while(p<=50) {
			System.out.println(p);
			if(p==5) {
				System.out.println("byee");
				p++;
			}
		}


}
}

//prints 1 infinite times.
