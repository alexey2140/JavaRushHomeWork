package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        int arr[] = new int[5];                             //Создаем массив пяти чисел
        for(int i = 0;i < arr.length; i++) {
            String s = reader.readLine();                   // считываем строку с клавиатуры
            arr[i] = Integer.parseInt(s);                   // парсим из строки число и заносим в ячейку номер i
        }
        Arrays.sort(arr);                                   //Сортируем массив

        for(int i = 0; i <  arr.length; i++) {              //Выводим отсортированный массив на экран
            System.out.println(arr[i] + "  ");
        }
    }
}
