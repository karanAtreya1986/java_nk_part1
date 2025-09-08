package com.day19;

//can implement multiple interface.
public class fortis5 implements usmedical2, ukmedical2, indianmedical2{

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

	@Override
	public void cardio() {
		System.out.println("fortis cardio");
		
	}

	@Override
	public String neuro() {
		System.out.println("fortis neuro");
		return "a";
	}

	@Override
	public void ortho() {
		System.out.println("fortis ortho");
	}
	
	//create two methods inside fortis.
	
	public void eye() {
		System.out.println("fortis eye");
	}
	
	public void ear() {
		System.out.println("fortis ear");
	}

}
