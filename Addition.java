package com.methods.prac;
import java.util.Scanner;

//Write a method that takes two integers as parameters and prints their sum. Call the method using the class name.

public class Addition {
    public static void add(int a , int b){
        int c = a + b ;
        System.out.println("SUM is : " + c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number : ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number : ");
        int b = sc.nextInt();
        sc.close();

        Addition.add(a,b);
    }

}
