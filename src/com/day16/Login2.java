package com.day16;

public class Login2 {
	
	private String username;
	private String password;
	
	//constructor.
	public Login2(String username, String password) {
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
	
	public void dologin(String username, String password) {
		System.out.println("enter username " + username);
		System.out.println("enter password " + password);
		System.out.println("click login");
		System.out.println("user logged in");
	}
	
public static void main(String[] args) {
	Login2 l1=new Login2("admin", "admin@##$23213");
	l1.dologin(l1.getUsername(), l1.getPassword());
}

}

//enter username admin
//enter password admin@##$23213
//click login
//user logged in

