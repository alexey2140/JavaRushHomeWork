package com.javarush.test.level07.lesson06.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 10 строчек в начало списка
1. Создай список строк в методе main.
2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
3. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> sList = new ArrayList<String>();          // создали список
        for (int i = 0; i < 10; i++) {                               // начиная с 0го элемента и до конца списка
            String s = reader.readLine();                           // строка s будет вводится с клавиатуры
            sList.add(0, s);                                       // заполняем список строкой s вводимой с клавиатуры
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(sList.get(i));
        }


    }
}
