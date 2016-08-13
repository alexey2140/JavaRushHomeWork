package com.javarush.test.level05.lesson09.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя конструкторами:
1 - Имя
2 - Имя, возраст
3 - Имя, возраст, пол
*/

public class Friend
{
    private String Fname = null;
    private int Fage;
    private String Fgender = null;

    public Friend(String name)                              // 1
    {
        this.Fname = name;
    }

    public Friend(String name, int age)                     // 2
    {
        this.Fname = name;
        this.Fage = age;
    }

    public Friend(String name, int age, String gender)      // 3
    {
        this.Fname = name;
        this.Fage = age;
        this.Fgender = gender;
    }

}