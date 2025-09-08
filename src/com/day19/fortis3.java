package com.day19;

//can implement multiple interface.
public class fortis3 implements usmedical2, ukmedical2{

	@Override
	public void physio() {
		System.out.println("fortis physio");
		
	}

	@Override
	public String onco() {
		System.out.println("fortis onco");
		return "onco";
	}

	@Override
	public void dental() {
		System.out.println("fortis dental");
		
	}

	@Override
	public void ent() {
		System.out.println("fortis ent");
		
	}

	@Override
	public int pedia() {
		System.out.println("fortis pedia");
		return 10;
	}

	@Override
	public void derma() {
		System.out.println("fortis derma");
		
	}

}
