package com.day20;

//multiple plus multi level inheritance.
public class fortis1_3 extends medical1_3 implements ukmedical1, indianmedical1, usmedical1 {

	@Override
	public void neuroServices() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void orthoServices() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cardioServices() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void oncologyServices() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void physioServices() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dentalServices() {
		// TODO Auto-generated method stub
		
	}
	
	//override the method from medical1_3.
	@Override
	public int checkup(int a) {
  		System.out.println("from fortis class -> Performing a medical checkup...");
  		return a;
  	}

}
