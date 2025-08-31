package com.day12;

public class customer5 {

    public int getcustomermarks(String name) {
        System.out.println("customer name is " + name);
        int marks = -1; // initialize with a default value

        // use equals ignore case, best case for strings.
        // even more best is to use trim also.
        if (name.trim().equalsIgnoreCase("johny")) {
            marks = 80;
        } else if (name.trim().equalsIgnoreCase("rose")) {
            marks = 90;
        } else if (name.trim().equalsIgnoreCase("tiger")) {
            marks = 70;
        } else {
            System.out.println("pass right customer name");
        }

        return marks; // only one return statement at the end
    }

    public static void main(String[] args) {

        customer5 c = new customer5();
        int marks = c.getcustomermarks("johny");
        System.out.println(marks);

        // How to use the returned variables
        if (marks > 0) {
            System.out.println("pass the marks");
        } else {
            System.out.println("fail the marks");
        }
    }
}

//customer name is johny
//80
//pass the marks
