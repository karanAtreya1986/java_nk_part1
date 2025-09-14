package com.day27;

import java.util.Arrays;

public class split8 {
	
	//Special char in java not read properly in split.
	//use double \
	
	public static void main(String[] args) {
		
		String data="Vibha.srivastava.878787.Pune@#$#@$.India";
		
		//Invalid escape sequence (valid ones are  \b  \t  \n  \f  \r  \"  \'  \\ )
		String[] split = data.split("\.");
		
		String string = Arrays.toString(split);
		System.out.println(string);
	}

}









