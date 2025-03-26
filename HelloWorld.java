package com.methods.prac;
//Write a method that prints "Hello, World!" when called. Call the method using the class name.

public class HelloWorld {
    public static void hello(){
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        System.out.println("Start");
        HelloWorld.hello();

        System.out.println("END");
    }
}
