package com.methods.prac;
//Write a method that takes two numbers as parameters and swaps them without returning anything.
// Call the method using the class name.

public class SwapNO {
    public static void numSwap( int a , int b){
        System.out.println("Before Swaping : ");
        System.out.println("a = "+a + " and "+ "b = "+b);
        a = a+b;       //10+30 = 40;
        b = a-b;       //40-30 = 10;
        a = a-b;       //40-10 = 30;
        System.out.println("After Swaping :");
        System.out.println("a = "+a+" and "+"b = "+b);

    }

    public static void main(String[] args) {
        SwapNO.numSwap(10,30);
    }
}
