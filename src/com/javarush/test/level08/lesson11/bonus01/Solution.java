package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Integer> months = new HashMap<>();//напишите тут ваш код

        months.put("January", 1);
        months.put("February", 2);
        months.put("March", 3);
        months.put("April", 4);
        months.put("May", 5);
        months.put("June", 6);
        months.put("July", 7);
        months.put("August", 8);
        months.put("September", 9);
        months.put("October", 10);
        months.put("November", 11);
        months.put("December", 12);

        String monthName = reader.readLine();

        Iterator<Map.Entry<String, Integer>> iterator = months.entrySet().iterator();

        while (iterator.hasNext())
        {   //получение «пары» элементов
            Map.Entry<String, Integer> pair = iterator.next();
            String key = pair.getKey();             //ключ
            Integer value = pair.getValue();        //значение
            if (pair.getKey().equals(monthName)) {
                System.out.println(pair.getKey() + " is " + pair.getValue() + " month");
            }
        }
    }
}
