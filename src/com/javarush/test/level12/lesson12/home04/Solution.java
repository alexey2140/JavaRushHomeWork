package com.javarush.test.level12.lesson12.home04;

/* Что это? «Кот», «Тигр», «Лев», «Бык», «хз»
Напиши метод, который определяет, какой объект передали в него.
Программа должна выводить на экран одну из надписей:
«Кот», «Тигр», «Лев», «Бык», «хз».
*/

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o)
    {
        //напишите тут ваш код
        Class c = o.getClass();
        String s = c.getName();
        String s2 = "";
        switch (s)
        {
            case "com.javarush.test.level12.lesson12.home04.Solution$Cat":
                s2 = "Кот";
                break;
            case "com.javarush.test.level12.lesson12.home04.Solution$Tiger":
                s2 = "Тигр";
                break;
            case "com.javarush.test.level12.lesson12.home04.Solution$Lion":
                s2 = "Лев";
                break;
            case "com.javarush.test.level12.lesson12.home04.Solution$Bull":
                s2 = "Бык";
                break;
            case "com.javarush.test.level12.lesson12.home04.Solution$Pig":
                s2 = "хз";
                break;
        }

        return s2;
    }

    public static class Cat
    {
    }

    public static class Tiger
    {
    }

    public static class Lion
    {
    }

    public static class Bull
    {
    }

    public static class Pig
    {
    }
}
