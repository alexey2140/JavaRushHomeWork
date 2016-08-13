package com.javarush.test.level07.lesson09.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* Слова в обратном порядке
Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> sList = new ArrayList<String>();

        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();                                           // fill common list
            sList.add(s);
        }
        sList.remove(2);
        for (int i = 0; i < sList.size(); i++) {
            int j = sList.size() - i - 1;
            System.out.println( sList.get(j) );
        }
    }
}
