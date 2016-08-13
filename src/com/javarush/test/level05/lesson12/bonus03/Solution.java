package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution {
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        int a = Integer.parseInt(s1);
        int max = -2147483648;                              // ??????????????????????????? вместо этого стоял 0 или
        if (a > 0) {                                        // вообще ничего, или же максимиум задавался через 1ое число из сравниваемых
            int i = 1;                                      // пока не поставил это значение тест не проходило
            while (i <= a) {                                // есть вариант из 2ой строки получить 1ое число и оно будет
                String s2 = reader.readLine();              //максимумом, остальные числа получаются из 3ей строки в цикле
                int b = Integer.parseInt(s2);               //while если каждое новое будет больше максимума оно будет им
                if (b > max) {max = b;i++;}                 //становится
                    else {i++;}
            }
            System.out.println(max);
        }
        else if (a < 0) {System.out.println(max);}
        else {System.out.println(max);}
    }
}
