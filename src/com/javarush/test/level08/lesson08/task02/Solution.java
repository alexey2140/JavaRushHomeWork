package com.javarush.test.level08.lesson08.task02;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/*Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/
public class Solution
{
    public static void main(String[] args) {
        removeAllNumbersMoreThan10(createSet());
    }
    public static HashSet<Integer> createSet() {
        HashSet<Integer> iSet = new HashSet<>();
        for (int i = 1; i <= 20; i++) {
            iSet.add(i);
        }
        return iSet;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()) {
            int item = iterator.next();
            if (item > 10) {
                iterator.remove();
            }
        }
            return set;
    }
}