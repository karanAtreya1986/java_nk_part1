package com.day25;

import java.util.Arrays;

public class string20 {

	public static void main(String[] args) {

		//split function.
		//returns string array.
		//get first element, then length, then print all array elements.

		String lang = "JAVA_PYTHON_RUBY_JAVASCRIPT";

		String lg[] = lang.split("_");
		System.out.println(lg[0]);
		System.out.println(lg.length);
		
		System.out.println(Arrays.toString(lg)); //gives output in list form.



	}

}

//JAVA
//4
//[JAVA, PYTHON, RUBY, JAVASCRIPT]





