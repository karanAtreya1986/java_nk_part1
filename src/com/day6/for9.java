package com.day6;

public class for9 {
	
	
	public static void main(String[] args) {
		
		//without colon we get error.
		
		int i=1;
		
		for () { //Syntax error on token "for", RecordHeaderName expected
			System.out.println(i); //Unreachable code
			i++;
		}
	}

}


