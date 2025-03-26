package com.methods.prac;
//Write a method that takes an integer N and prints natural numbers from N to 1.
// Call the method using the class name.

public class NaturalNO {
    public static void printNumbers(int N) {
        for (int i = N; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println(); // New line after printing
    }

    public static void main(String[] args) {
        NaturalNO.printNumbers(10);
    }
}
