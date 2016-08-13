package com.javarush.test.level07.lesson12.home02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Ввести с клавиатуры 2 числа N  и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> sList = new ArrayList<String>();

        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());

        for (int i = 0; i < N; i++) {
            String s1 = reader.readLine();
            sList.add(s1);
        }

        for (int i = 0; i < M; i++) {
            int K = sList.size();
            String s = sList.get(0);
            sList.remove(0);
            sList.add(K-1 ,s);
        }

        for (int i = 0; i < N; i++) {
            System.out.println(sList.get(i));
        }
    }
}