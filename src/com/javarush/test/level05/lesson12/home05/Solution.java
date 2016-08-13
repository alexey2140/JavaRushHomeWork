package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;
        String s1;
        String s2 = "сумма";

        while (true) {
            s1 = reader.readLine();
            if (s1.equals(s2)) {
                System.out.println(count);
                break;
            }
            else {
                s1 = reader.readLine();
                int a = Integer.parseInt(s1);
                count = count + a;
            }
        }
    }
}
