package com.javarush.test.level04.lesson07.task04;

/* Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        int n1 = Integer.parseInt(s1);
        String s2 = reader.readLine();
        int n2 = Integer.parseInt(s2);
        String s3 = reader.readLine();
        int n3 = Integer.parseInt(s3);

        int pn = 0;
        int nn = 0;
        boolean m1 = n1 > 0;
        boolean m2 = n2 > 0;
        boolean m3 = n3 > 0;

        if (m1)
            pn = pn + 1;
        else
            nn = nn + 1;

        if (m2)
            pn = pn + 1;
        else
            nn = nn + 1;
        if (m3)
            pn = pn + 1;
        else
            nn = nn + 1;

        System.out.println("количество отрицательных чисел: "+ nn);
        System.out.println("количество положительных чисел: "+ pn);
    }
}
