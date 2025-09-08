package com.day19;

public interface usmedical16 {
	
//	private int i=10;//Illegal modifier for the interface field usmedical16.i; only public, static & final are permitted
//	private void getname();//This method requires a body instead of a semicolon
//	public final void getstreet();//Illegal modifier for the interface method getstreet; only public, private, abstract, default, static and strictfp are permitted
	
	private int getaddress(String name) {
		System.out.println(name);
		return 10;
	}
	
	default int getprivateMethod(String name) {
		getaddress(name);
		return 100;
	}
}
