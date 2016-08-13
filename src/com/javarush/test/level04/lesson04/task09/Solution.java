package com.javarush.test.level04.lesson04.task09;

/* Светофор
Работа светофора для пешеходов запрограммирована следующим образом: в начале каждого часа в течение трех минут горит зеленый сигнал,
затем в течение одной минуты — желтый, а потом в течение одной минуты — красный, затем опять зеленый горит три минуты и т. д.
Ввести с клавиатуры вещественное число t, означающее время в минутах, прошедшее с начала очередного часа.
Определить, сигнал какого цвета горит для пешеходов в этот момент.
Результат вывести на экран в следующем виде:
"зеленый" - если горит зеленый цвет, "желтый" - если горит желтый цвет, "красный" - если горит красный цвет.
Пример для числа 2.5:
зеленый
Пример для числа 3:
желтый
Пример для числа 4:
красный                          0   -   3                     4                       5
Пример для числа 5:        ОТ 00:00 до 02:59 зеленый  с 03:00 до 03:59 желтый  с 4:00 до 4:59 красный
                            20:00 22:59 зеленый  23:00 - 23:59 желтый
зеленый
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        int t = Integer.parseInt(s1);
        if (t >=0 && t<=2)
            System.out.println("зеленый");
        else
                if (t == 3)
                System.out.println("желтый");
        else
                if (t == 4)
                    System.out.println("красный");
        if (t >=5 && t<=7)
            System.out.println("зеленый");
        else
                if (t == 8)
            System.out.println("желтый");
        else
                if (t == 9)
            System.out.println("красный");
                if (t >=10 && t<=12)
            System.out.println("зеленый");
        else
                if (t == 13)
            System.out.println("желтый");
        else
                if (t == 14)
            System.out.println("красный");
                if (t >=15 && t<=17)
            System.out.println("зеленый");
        else
                if (t == 18)
            System.out.println("желтый");
        else
                if (t == 19)
            System.out.println("красный");
                if (t >=20 && t<=22)
            System.out.println("зеленый");
        else
                if (t == 23)
            System.out.println("желтый");
        else
                if (t == 24)
            System.out.println("красный");
                if (t >=25 && t<=27)
            System.out.println("зеленый");
        else
                if (t == 28)
            System.out.println("желтый");
        else
                if (t == 29)
            System.out.println("красный");
                 if (t >=30 && t<=32)
            System.out.println("зеленый");
        else
                 if (t == 33)
            System.out.println("желтый");
        else
                 if (t == 34)
            System.out.println("красный");
                if (t >=35 && t<=37)
            System.out.println("зеленый");
        else
                if (t == 38)
            System.out.println("желтый");
        else
                if (t == 39)
            System.out.println("красный");
                if (t >=40 && t<=42)
            System.out.println("зеленый");
        else
                if (t == 43)
            System.out.println("желтый");
        else
                if (t == 44)
            System.out.println("красный");
                if (t >=45 && t<=47)
            System.out.println("зеленый");
        else
                if (t == 48)
            System.out.println("желтый");
        else
                if (t == 49)
            System.out.println("красный");
                if (t >=50 && t<=52)
            System.out.println("зеленый");
        else
                if (t == 53)
            System.out.println("желтый");
        else
                if (t == 54)
            System.out.println("красный");
                if (t >=55 && t<=57)
            System.out.println("зеленый");
        else
                 if (t == 58)
            System.out.println("желтый");
        else
                 if (t == 59)
            System.out.println("красный");


    }
}