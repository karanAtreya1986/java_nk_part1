package com.day13;

public class tax1 {
	
	public double calculateTax(int totalIncome, int bonus, int stocksProfit) {
        System.out.println("calculating tax");
        double totalTax = (totalIncome * 30) / 100.0 
                        + (bonus * 5) / 100.0 
                        + (stocksProfit * 2) / 100.0;
        return totalTax;
    }
	
	public double calculateTax(int totalIncome, int bonus) {
        System.out.println("calculating tax");
        double totalTax = (totalIncome * 30) / 100.0 
                        + (bonus * 5) / 100.0;
        return totalTax;
    }
	
	 public static void main(String[] args) {
		 tax1 obj = new tax1();

	        double tax = obj.calculateTax(1000, 500, 300);
	        System.out.println(tax);

	        double tax1 =  obj.calculateTax(4000, 200);
	        System.out.println(tax1);
	    }

}

//calculating tax
//331.0
//calculating tax
//1210.0

