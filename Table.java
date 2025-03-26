package com.methods.prac;
import java.util.Scanner;

//Write a method that takes an integer as a parameter and prints whether it is even or odd. Call the method using the class name
public class Table {
    public static void mytable(int a){
        for (int i = 1 ; i <= 10 ; i++ ){
            int result = a * i ;
            System.out.println(result);
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number :");
        int a = sc.nextInt();
        sc.close();
        Table.mytable(a);

    }
}
