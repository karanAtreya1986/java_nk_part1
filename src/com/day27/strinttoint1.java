package com.day27;

public class strinttoint1 {
	
	public static void main(String[] args) {
		
		//string to int.
		String t1="tiger";
		System.out.println(t1+20); //tiger20
		
		String t2="100";
		int i=Integer.parseInt(t2);
		System.out.println(i+121.56);//221.56
		
		//range of int.
		int minValue = Integer.MIN_VALUE;
		int maxValue = Integer.MAX_VALUE;
		System.out.println(minValue);//-2147483648
		System.out.println(maxValue);//2147483647
		
		//range of byte.
		byte minValue2 = Byte.MIN_VALUE;
		byte maxValue2 = Byte.MAX_VALUE;
		System.out.println(minValue2); //-128
		System.out.println(maxValue2); //127
	}

}
