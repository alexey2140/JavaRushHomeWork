package com.javarush.test.level04.lesson10.task05;

import java.io.*;

/* Таблица умножения
Вывести на экран таблицу умножения 10х10 используя цикл while.
Числа разделить пробелом.
1 2 3 4 5 6 7 8 9 10
2 4 6 8 10 12 14 16 18 20
...
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int n = 1;

        while (n <= 10)
        {
            System.out.println(n*1+" "+n*2+" "+n*3+" "+n*4+" "+n*5+" "+n*6+" "+n*7+" "+n*8+" "+n*9+" "+n*10);
            n++;
        }
    }
}
