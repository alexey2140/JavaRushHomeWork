package com.javarush.test.level07.lesson06.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution {
                                       // обьявили переменную longestString типа String
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> sList = new ArrayList<String>();          // создали список
        String longestString;
        for (int i = 0; i < 5; i++) {                               // начиная с 0го элемента и до конца списка
            String s = reader.readLine();                           // строка s будет вводится с клавиатуры
            sList.add(s);                                           // заполняем список строкой s вводимой с клавиатуры
        }
        longestString = sList.get(0);                               // переменная longestString принимает значение 0го элемента списка
        for (int i = 1; i < 5; i++) {                               // начиная с 1го элемента и до конца списка
            if (longestString.length() < sList.get(i).length()) {   // если значение длины самой длинной строки меньше чем значение длины просматриваемого элемента то выполнить команды оператора if
                longestString = sList.get(i);                       // команды (команда) оператора if. Переменная longestString принимает значение принимаемого элемента
            }
        }
        for (int i1 = 1; i1 < 5; i1++) {                            // начиная с 0го элемента и до конца списка
            if (sList.get(i1).length() == longestString.length()) { // если длина самой длинной строки равна длине просматриваемого элемента то выполнить вложенный if
                System.out.println(sList.get(i1));
            }
        }
    }
}