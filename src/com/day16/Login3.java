package com.day16;

public class Login3 {
	
	private String username;
	private String password;
	
	//constructor.
	public Login3(String username, String password) {
		this.username = username;
		this.password = password;
	}

	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	//add method.
	//removed parameters and used the getters and setters.
	public void dologin() {
		System.out.println("enter username " + getUsername());
		System.out.println("enter password " + getPassword());
		System.out.println("click login");
		System.out.println("user logged in");
	}
	
public static void main(String[] args) {
	Login3 l1=new Login3("admin", "admin@##$23213");
	l1.dologin();
	
	//get the username and password.
	System.out.println(l1.getUsername());
	System.out.println(l1.getPassword());
	
	//set the password.
	l1.setPassword("tester");
	System.out.println(l1.getUsername());
	System.out.println(l1.getPassword());
	
	//create another object.
	//give some another email and name.
	Login3 l2=new Login3("tester", "tester@##$23213");
	l2.dologin();
}

}

//enter username admin
//enter password admin@##$23213
//click login
//user logged in
//admin
//admin@##$23213
//admin
//tester

//enter username tester
//enter password tester@##$23213
//click login
//user logged in


