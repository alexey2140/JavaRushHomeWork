package com.javarush.test.level12.lesson12.home05;

/* Что это? «Кот», «Тигр», «Лев», «Бык», «Корова», «Животное»
Напиши метод, который определяет, какой объект передали в него.
Программа должна выводить на экран одну из надписей:
«Кот», «Тигр», «Лев», «Бык», «Корова», «Животное».
Замечание: постарайся определять тип животного как можно более точно.
*/

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Animal()));
    }

    public static String getObjectType(Object o)
    {
        //напишите тут ваш код
        Class c = o.getClass();
        String s = c.getName();
        String s2 = "";
        switch (s)
        {
            case "com.javarush.test.level12.lesson12.home05.Solution$Cat":
                s2 = "Кот";
                break;
            case "com.javarush.test.level12.lesson12.home05.Solution$Tiger":
                s2 = "Тигр";
                break;
            case "com.javarush.test.level12.lesson12.home05.Solution$Lion":
                s2 = "Лев";
                break;
            case "com.javarush.test.level12.lesson12.home05.Solution$Bull":
                s2 = "Бык";
                break;
            case "com.javarush.test.level12.lesson12.home05.Solution$Cow":
                s2 = "Корова";
                break;
            case "com.javarush.test.level12.lesson12.home05.Solution$Animal":
                s2 = "Животное";
                break;
        }

        return s2;
    }

    public static class Cat extends Animal   //<--Классы наследуются!!
    {
    }

    public static class Tiger extends Cat
    {
    }

    public static class Lion extends Cat
    {
    }

    public static class Bull extends Animal
    {
    }

    public static class Cow extends Animal
    {
    }

    public static class Animal
    {
    }
}
