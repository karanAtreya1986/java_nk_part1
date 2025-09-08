package com.day19;

public interface usmedical18 {

	private int getaddress(String name) {
		System.out.println(name);
		return 10;
	}
	
	default int getprivateMethod(String name) {
		getaddress(name);
		return 100;
	}
}
