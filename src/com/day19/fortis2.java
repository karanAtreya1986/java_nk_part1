package com.day19;

//implement one interface.
public class fortis2 implements usmedical2{

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

}
