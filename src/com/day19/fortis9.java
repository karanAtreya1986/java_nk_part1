package com.day19;

//can implement multiple interface.
public class fortis9 implements usmedical9{

	@Override
	public void physio() {
		System.out.println("fortis physio");		
	}

	@Override
	public String onco() {
		System.out.println("fortis onco");	
		return "tiger";
	}

	@Override
	public void dental() {
		System.out.println("fortis dental");	
	}

	@Override
	public void emergency() {
		System.out.println("fortis emergency");	
	}
	
	public static int getstatic1(String name) {
		System.out.println("get static 1 method from child class");
		return 190;
	}

	

}
