package com.day13;

public class browser8 {
		
		public boolean launchBrowser(String browserName) {
			
//			Proper way to use flags for invalid case.

		    System.out.println("browser name : " + browserName);
		    boolean flag = true;

		    
		    switch (browserName.trim().toLowerCase()) { 

		        case "chrome":
		            System.out.println("launch google chrome");
		            break;

		        case "firefox":
		            System.out.println("launch firefox");
		            break;

		        case "edge":
		            System.out.println("launch edge");
		            break;

		        case "safari":
		            System.out.println("launch safari");
		            break;

		        default:
		            System.out.println("plz pass the right browser name : " + browserName);
		            flag=false;
		            break;
		    }

		    return flag;
		}
		
		public static void main(String[] args) {
			
			browser8 b3=new browser8();
			boolean exec=b3.launchBrowser("ie");
			System.out.println(exec);
			
			if(exec) {
				System.out.println("run the url");
			}
		}

}

//browser name : ie
//plz pass the right browser name : ie
//false

