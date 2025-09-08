package com.day19;

public interface usmedical19 {
	
	default int getprivateMethod(String name) {
		System.out.println(name);
		return 100;
	}
}
