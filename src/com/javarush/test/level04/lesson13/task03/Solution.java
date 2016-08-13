package com.javarush.test.level04.lesson13.task03;

import java.io.*;

/* Рисуем треугольник
Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
Пример:
8
88
888
...
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        int h = Integer.parseInt(s1);

        for (int i1 = 1; i1 <= h; i1++)
        {
            System.out.println("");
            for (int i = 1; i <= i1; i++)
            {
                System.out.print(8);
            }
        }
    }
}
