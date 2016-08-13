package com.javarush.test.level05.lesson12.bonus02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.
Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.
*/

public class Solution
{

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        int a = Integer.parseInt(s1);
        String s2 = reader.readLine();
        int b = Integer.parseInt(s2);
        String s3 = reader.readLine();
        int c = Integer.parseInt(s3);
        String s4 = reader.readLine();
        int d = Integer.parseInt(s4);
        String s5 = reader.readLine();
        int e = Integer.parseInt(s5);

        int minimumAB = min(a, b);
        int minimumCD = min(c, d);
        int minimumABCD = min(minimumAB,minimumCD);
        int absMinimum = min(minimumABCD,e);

        System.out.println("Minimum = " + absMinimum);
    }

    public static int min(int a, int b)
    {
        return a < b ? a : b;
    }
}
