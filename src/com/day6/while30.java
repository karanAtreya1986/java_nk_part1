package com.day6;

public class while30 {
	
	public static void main(String[] args) {
		
		int n=1;
		while(true) {
			System.out.println(n);
			n++;
		}
		if(n==1) { //Unreachable code
			break;
		}
		
		
	}

}

