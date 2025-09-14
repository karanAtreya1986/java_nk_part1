package com.day27;

import java.util.Arrays;

public class split4 {
	
	//split with double pipe doesnt work.
	
	public static void main(String[] args) {
		
		String data="Vibha||srivastava||878787||Pune@#$#@$||India";
		
		String[] split = data.split("||");
		
		String string = Arrays.toString(split);
		System.out.println(string);
	}

}

//[V, i, b, h, a, |, |, s, r, i, v, a, s, t, a, v, a, 
// |, |, 8, 7, 8, 7, 8, 7, |, |, P, u, n, e, @, #, $, #, @, $, |, |, I, n, d, i, a]




