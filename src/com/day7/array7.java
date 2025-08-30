package com.day7;

public class array7 {

	public static void main(String[] args) {
		
		int a[]=new int[5];
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		//another way to print.
		int len=a.length;
		for(int i=0;i<=len-1;i++) {
			System.out.println(a[i]);
		}
	}
}

//10
//20
//30
//40
//50

