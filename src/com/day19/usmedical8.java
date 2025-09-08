package com.day19;

public interface usmedical8 {

	public void physio();
	public String onco();
	public void dental();

	//common method in all interfaces.
	public void emergency();

	//static method inside interface.
	public static int getstatic(String name) {
		System.out.println("static method" + name);
		return 10;
	}

		public static int getstatic1(String name) {
			System.out.println("get static 1 method from interface " + name);
			return 10;
		}

}
