package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
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

        if (n1 > n2 && n1 > n3 && n2 > n3)
        {
            System.out.println(n1);
            System.out.println(n2);
            System.out.println(n3);
        }
        else
            if (n1 > n2 && n1 > n3 && n3 > n2)
            {
                System.out.println(n1);
                System.out.println(n3);
                System.out.println(n2);
            }
        else
                if (n2 > n1 && n2 > n3 && n1 > n3)
                {
                    System.out.println(n2);
                    System.out.println(n1);
                    System.out.println(n3);
                }
        else
                    if (n2 > n1 && n2 > n3 && n3 > n1)
                    {
                        System.out.println(n2);
                        System.out.println(n3);
                        System.out.println(n1);
                    }
        else
                        if (n3 > n1 && n3 > n2 && n2 > n1)
                        {
                            System.out.println(n3);
                            System.out.println(n2);
                            System.out.println(n1);
                        }
        else
                            if (n3 > n1 && n3 > n2 && n1 > n2)
                            {
                                System.out.println(n3);
                                System.out.println(n1);
                                System.out.println(n2);
                            }

    }
}
