package com.javarush.test.level05.lesson09.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью конструкторами:
1 - Имя,
2 - Имя, вес, возраст
3 - Имя, возраст (вес стандартный)
4 - вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
5 - вес, цвет, адрес ( чужой домашний кот)
Задача конструктора – сделать объект валидным. Например, если вес не известен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    private String catName = null;
    private int catWeight;
    private int catdAge;
    private String catColor = null;
    private String catAdr = null;

    public Cat(String name)                                   // 1
    {
        this.catName = name;
    }

    public Cat(String name, int weight, int age)              // 2
    {
        this.catName = name;
        this.catWeight = weight;
        this.catdAge = age;
    }

    public Cat(String name, int age)                          // 3
    {
        this.catName = name;
        this.catdAge = age;
        this.catWeight = 3;
    }

    public Cat(int weight, String color)                      // 4
    {
        this.catWeight = weight;
        this.catColor = color;
        this.catName = "null";
        this.catAdr = "null";
        this.catdAge = 3;

    }

    public Cat(int weight, String color, String adr)          // 5
    {
        this.catWeight = weight;
        this.catColor = color;
        this.catAdr = "neib";

    }

}
