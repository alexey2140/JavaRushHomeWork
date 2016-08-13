package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution {


    public static void main(String[] args) {
        System.out.println(getCountTheSameFirstName(createMap(), "Иван"));
        System.out.println(getCountTheSameLastName(createMap(), "Петров"));
    }

    public static HashMap<String, String> createMap() {
        HashMap <String, String> sMap = new HashMap<>();

        sMap.put("Петренко", "Иван");
        sMap.put("Петров", "Вася");
        sMap.put("Иванченко", "Иван");
        sMap.put("Иванович", "Вася");
        sMap.put("Сидоров", "Иван");
        sMap.put("Сидорчук", "Иван");
        sMap.put("Сидорио", "Иван");
        sMap.put("Иванчевичус", "Иван");
        sMap.put("Сидоревичус", "Иван");
        sMap.put("Сидоряк", "Иван");

        return sMap;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {

        int fNCount = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            String name1 = pair.getValue();
            if (name.equals(name1))
                fNCount++;
        }
        return fNCount;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lasName) {

        int lNCount = 0;
        for (Map.Entry<String, String> pair1 : map.entrySet()) {
            String fam = pair1.getKey();
            if (fam.equals(lasName))
                lNCount++;
        }
        return lNCount;
    }
}