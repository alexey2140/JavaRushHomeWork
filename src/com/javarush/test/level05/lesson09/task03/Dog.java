package com.javarush.test.level05.lesson09.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
1 - Имя
2 - Имя, рост
3 - Имя, рост, цвет
*/

public class Dog
{
    private String dogName = null;
    private int dogHeight;
    private String dogColor = null;

    public Dog(String name)                                                  // 1
    {
        this.dogName = name;
    }

    public Dog(String name, int height)                                      // 2
    {
        this.dogName = name;
        this.dogHeight = height;
    }

    public Dog(String name, int height, String color)                        // 3
    {
        this.dogName = name;
        this.dogHeight = height;
        this.dogColor = color;
    }

}
