package com.javarush.test.level08.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Нужно добавить в программу новую функциональность
Новая задача: Программа должна работать с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи

Лондон

Пример вывода:
Абрамовичи
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, String> cityAndLastName = new HashMap<>();//напишите тут ваш код

        while (true) {

            String sCity = reader.readLine();

            if (sCity.isEmpty())
            {
                break;
            }
            String sLastName = reader.readLine();
            if (sLastName.isEmpty())
            {
                break;
            }
            cityAndLastName.put(sCity, sLastName);
        }

        Iterator<Map.Entry<String, String>> iterator = cityAndLastName.entrySet().iterator();
        String searchByCity = reader.readLine();
        while (iterator.hasNext()) {   //получение «пары» элементов
            Map.Entry<String, String> pair = iterator.next();

            if (pair.getKey().equals(searchByCity)) {
                System.out.println(pair.getValue());
            }
        }
    }
}
