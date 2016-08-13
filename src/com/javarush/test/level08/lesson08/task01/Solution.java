package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution {
    public static HashSet<String> createSet() {
        HashSet<String> sSet = new HashSet<>();{
            sSet.add("Лучший");
            sSet.add("Летчик");
            sSet.add("Левый");
            sSet.add("Литой");
            sSet.add("Лекарь");
            sSet.add("Лев");
            sSet.add("Лук");
            sSet.add("Литье");
            sSet.add("Ленивый");
            sSet.add("Летающий");
            sSet.add("Луна");
            sSet.add("Линия");
            sSet.add("Лорд");
            sSet.add("Лето");
            sSet.add("Ложка");
            sSet.add("Лодка");
            sSet.add("Лететь");
            sSet.add("Лес");
            sSet.add("Лего");
            sSet.add("Лестер");
        }
        return sSet;
    }

    public static void main(String[] args) {
        createSet();
    }
}
