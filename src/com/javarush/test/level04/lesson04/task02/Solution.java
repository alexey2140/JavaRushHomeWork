package com.javarush.test.level04.lesson04.task02;

/* Ближайшее к 10
Реализовать метод closeToTen. Метод должен выводить на экран ближайшее к 10 из двух чисел, записанных в аргументах метода.
Например, среди чисел 8 и 11 ближайшее к десяти 11. Если оба числа на равной длине к 10, то вывести на экран любое из них.
Подсказка:  используйте метод public static int abs(int a), который возвращает абсолютную величину числа.
*/

public class Solution
{
    public static void main(String[] args)
    {
        closeToTen(8,11);
        closeToTen(14,7);
    }

    public static void closeToTen(int a, int b)
    {
        int countA = 0;
        int countB = 0;
        if (a<10)
        {
            for (int i = a; i != 10; i++)
                countA = countA + 1;
        }
        if (a>10)
        {
            for (int i = a; i != 10; i--)
                countA = countA + 1;
        }
        if (b<10)
        {
            for (int i = b; i != 10; i++)
                countB = countB + 1;
        }
        if (b>10)
        {
            for (int i = b; i != 10; i--)
                countB = countB + 1;
        }
        if (countA < countB)
            System.out.println("Первое число ближе к 10, оно на расстоянии " + countA + " от него");
        if (countB < countA)
            System.out.println("Второе число ближе к 10, оно на расстоянии " + countB + " от него");
        if (countA == countB)
            System.out.println("Оба числа одинаково близки к 10, они на расстоянии " +countA);


    }
}