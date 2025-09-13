package com.day26;

import java.util.Arrays;
import java.util.Iterator;

public class reversestring16 {

	public static String reverseString(String name) {

		if(name==null) {
			System.out.println("name is null");

		}

		//when string length is 1 then return as is.
		if(name.length()==1 || name.length()==0) {
			return name;
		}
		
		String s1[]=name.split(" ");
		System.out.println(Arrays.toString(s1));//[java, ruby, python]

		int len=s1.length;
		System.out.println(len);//3

		String individualones="";
		String rev="";
		
		
		for(int i=0;i<=len-1;i++) {
			//have it inside loop.
			//so for every loop it will be fresh and blank.
			String reversedwords="";
			
			individualones=s1[i];
			System.out.println(individualones);
			
			int len1=s1[i].length();
			
			for(int j=len1-1; j>=0; j--) {
				reversedwords=reversedwords+individualones.charAt(j);
			}
			//once outside the loop concat with the blank rev and add space.
			rev=rev+reversedwords+" ";
		}
		return rev + " ";
	}

	public static void main(String[] args) {



		String test="java ruby python";
		String s81=reverseString(test);
		System.out.println(s81);





	}

}

//[java, ruby, python]
//3
//java
//ruby
//python
//avaj ybur nohtyp  













