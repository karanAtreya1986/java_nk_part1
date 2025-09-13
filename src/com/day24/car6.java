package com.day24;

 class car6 {
	
	String name;
	public int price;
	protected String color;
	private String chasisnumber;
	
	//create constructor protected.
	protected car6(String name, int price, String color, String chasisnumber) {
		this.name=name;
		this.price=price;
		this.color=color;
		this.chasisnumber=chasisnumber;
		
		System.out.println(this.name);
		System.out.println(name);
		System.out.println(this.price);
		System.out.println(price);
		System.out.println(this.color);
		System.out.println(color);
		System.out.println(this.chasisnumber);
		System.out.println(chasisnumber);
		System.out.println("parent class constructor");
	}

}


