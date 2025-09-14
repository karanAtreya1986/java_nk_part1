package com.day27;

import java.util.Arrays;

public class split2 {
	
	//split with dot doesnt work.
	
	public static void main(String[] args) {
		
		String data="Vibha.srivastava.878787.Pune@#$#@$.India";
		
		String[] split = data.split(".");
		
		String string = Arrays.toString(split);
		System.out.println(string);
	}

}

//[]


