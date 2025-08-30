package com.day7;

public class do11 {
	
	public static void main(String[] args) {
		
		//break cannot come out of loops or switch.
		int i=1;
		do {
			System.out.println(i); 
			i--;
			
		}
		while(i>=0);
		break; //break cannot be used outside of a loop or a switch
		
		
		
	}

}




