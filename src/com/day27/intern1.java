package com.day27;

public class intern1 {
	
	public static void main(String[] args) {
		
		//intern - when we create string using new keyword.
		//two references created - heap and scp.
		//heap one referred by s.
		//scp one unreferred.
		//ready for garbage collector.
		//intern helps to refer to scp string.
		
		String s=new String("hello world");
		
		String s1=s.intern();//doesnt take any input.
		
		System.out.println(s1);//hello world
		
		System.out.println(s);//hello world
		
		System.out.println(s==s1);//false
		
		System.out.println(s.equals(s1)); //true
				
	}

}
