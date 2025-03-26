package com.methods.prac;
//Write a method that takes an integer as a parameter and prints whether it is positive, negative, or zero.
// Call the method using the class name.

public class PosvNegv {
    public static void postive(int num1 ,int num2){
        if (num1 > num2) {
            System.out.println(num1 + " is greater.");
        } else if (num2 > num1) {
            System.out.println(num2 + " is greater.");
        } else {
            System.out.println("Both numbers are equal.");
        }
    }

    public static void main(String[] args) {
        PosvNegv.postive(100,80);
    }
}
