package com.javarush.test.level04.lesson06.task05;

/* 18+
Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись «Подрасти еще».
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String name = s1;
        String s2 = reader.readLine();
        int n2 = Integer.parseInt(s2);

        if (n2 < 18)
            System.out.println("Подрасти еще");

    }
}
