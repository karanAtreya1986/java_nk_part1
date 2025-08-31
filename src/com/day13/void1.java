package com.day13;

public class void1 {
	
	//when void is return then blank return also works.
	
	public void click(String element) {
		System.out.println("click on the element " + element);
		return;
	}
	
	public static void main(String[] args) {
		
		void1 v1=new void1();
		v1.click("login");
	}

}

//click on the element login

