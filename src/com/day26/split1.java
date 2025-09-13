package com.day26;

import java.util.Arrays;

public class split1 {
	
	public static void main(String[] args) {
		
		//when we give delimiter which is not present.
		//we get the same input as output.
		String u ="java_python";
		String p1[]=u.split("_");
		System.out.println(u);
		System.out.println(p1);
		String s2=Arrays.toString(p1);
		System.out.println(s2);
	}

}

//java_python
//[Ljava.lang.String;@5ca881b5
//[java, python]

