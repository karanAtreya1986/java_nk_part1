package com.day25;

public class string4 {

	public static void main(String[] args) {
		
		String str = "hi this is my java code and i am so happy";
		
//index of function.
		//takes in character or string, and start index if needed.
		int i1=str.indexOf("h");
		System.out.println(i1); //0
		
		//index of character occuring multiple times.
		//the first occurrence location is given.
		
		int i2=str.indexOf("a");
		System.out.println(i2); //15
		
		//index of character not present.
		int i3=str.indexOf("z");
		System.out.println(i3); //-1
		
		//print second occurrence.
		//give the location from where to start in second parameter.
		int i4= str.indexOf("a", 16);
		System.out.println(i4); //17
		
		//Second occurrence without hard coding
		//give the location from where to start in second parameter.
		int i5=str.indexOf("a", str.indexOf("a")+1);
		System.out.println(i5); //17
		
		//Third occurrence-
		int i6=str.indexOf("a", str.indexOf("a", str.indexOf("a")+1)+1);
		System.out.println(i6); //24
		
		//third occurrence.
		int i7=str.indexOf("a", str.indexOf("a")+1);
		System.out.println(i7);//17
		
		int i8=str.indexOf('a', i7+1);
		System.out.println(i8);//24
		System.out.println(i8); //24
		
		//one liner code for index of.
		//third occurrence.
		int i9=str.indexOf("a", str.indexOf("a", str.indexOf("a")+1)+1);
		System.out.println(i9);//24

	}
}


