package com.javarush.test.level09.lesson06.task01;

public class ExceptionExample2 {
    public static void main(String[] args) {
        System.out.println("Program starts");

        try {
            System.out.println("Before method1 calling");
            method1();
            System.out.println("After method1 calling. Never will be shown");
        }

        catch (Exception e) {
            System.out.println("Exception1 has been caught");
        }

        try {
            System.out.println("Before method2 calling");

            method2();
            System.out.println("After method2 calling. Never will be shown");
        }

        catch (Exception e) {
            System.out.println("Exception2 has been caught");
        }
        System.out.println("Program is still running");
    }

    public static void method1() {
        int a = 100;
        int b = 0;
        System.out.println(a / b);
    }

    public static void method2() {
        int a = 100;
        int b = 0;
        System.out.println(a / b);
    }
}