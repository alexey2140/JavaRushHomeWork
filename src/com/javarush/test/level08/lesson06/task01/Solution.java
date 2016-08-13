package com.javarush.test.level08.lesson06.task01;

import java.util.*;

/* Создать два списка LinkedList и ArrayList
Нужно создать два списка – LinkedList и ArrayList.
*/

public class Solution
{
    public static Object createArrayList()
    {
        ArrayList<Object> linList = new ArrayList<>();
        return linList;
    }

    public static Object createLinkedList()
    {
        LinkedList<Object> arrList = new LinkedList<>();
        return arrList;
    }

    public static void main(String[] args)
    {
        createArrayList();
        createLinkedList();
    }
}
