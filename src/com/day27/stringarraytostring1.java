package com.day27;

public class stringarraytostring1 {
	
	public static void main(String[] args) {
		
		String s1[]= {"tiger", "ali", "3243", "32423.234324", "@#$", "23423$%$#%$#"};
		String valueOf = String.valueOf(s1);
		System.out.println(valueOf);//[Ljava.lang.String;@5ca881b5
		
		System.out.println(valueOf+20);//[Ljava.lang.String;@5ca881b520
		
	}

}
