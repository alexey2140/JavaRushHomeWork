package com.javarush.test.level07.lesson09.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* Слово «именно»
1. Создай список из слов «мама», «мыла», «раму».
2. После каждого слова вставь в список строку, содержащую слово «именно».
3. Используя цикл for вывести результат на экран, каждый элемент списка с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> sList = new ArrayList<String>();
        sList.add("мама");
        sList.add("мыла");
        sList.add("раму");

        for(int i = 0; i < 6;i++) {
            if (sList.get(i).equals("мама") || sList.get(i).equals("мыла") || sList.get(i).equals("раму")) {
                sList.add(i + 1, "именно");
            }
        }
        for(int i = 0; i < 6 ; i++) {
            System.out.println(sList.get(i));
        }
    }
}