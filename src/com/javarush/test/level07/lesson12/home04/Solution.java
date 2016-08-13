package com.javarush.test.level07.lesson12.home04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
/*
1. Создать список строк.
2. Ввести строки с клавиатуры и добавить их в список.
3. Вводить с клавиатуры строки, пока пользователь не введёт строку "end".  "end" не учитывать.
4. Вывести строки на экран, каждую с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> sList = new ArrayList<String>();

        while (true) {
            String s = reader.readLine();
            sList.add(s);

            if (s.equals("end")) {
                break;
            }
        }
        print(sList);
    }
        public static void print(List<String> list) {
            for (int i = 0; i < list.size() - 1; i++) {
                System.out.println(list.get(i));
            }
        }
}