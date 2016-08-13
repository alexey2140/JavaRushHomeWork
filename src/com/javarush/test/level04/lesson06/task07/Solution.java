package com.javarush.test.level04.lesson06.task07;

/* Три числа
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
Вывести на экран порядковый номер числа, отличного от остальных.
Пример для чисел 4 6 6:
1
Пример для чисел 6 6 3:
3
*/

import java.io.*; import java.util.Scanner;

public class Solution { public static void main(String[] args) throws Exception
{
    Scanner scanner = new Scanner(System.in); int arr [] = new int [3] ; arr[0] = scanner.nextInt(); arr[1] = scanner.nextInt(); arr[2] = scanner.nextInt();

    if (arr[0] != arr[1] && arr[0] != arr[2] )
    {
        System.out.println(arr.length -2);
    }
    if (arr[1] != arr[0] && arr[1] != arr[2] )
    {
        System.out.println(arr.length -1);
    }
    if (arr[2] != arr[1] && arr[2] != arr[0] )
    {
        System.out.println(arr.length );
    }
}
}
