package com.javarush.test.level05.lesson05.task02;

/* Реализовать метод fight
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Зависимость придумать самому. Метод должен определять, выиграли ли мы (this) бой или нет,
т.е. возвращать true, если выиграли и false - если нет.
Должно выполняться условие:
если cat1.fight(cat2) = true , то cat2.fight(cat1) = false
*/

public class Cat {                                                                      // Класс "Cat".
    public String name;                                                                 // Объявление переменной "name" типа String.
    public  int age, weight, strength;                                                  // Объявление переменных "age","weight" и "strength" типа int.
                                                                                        //
    public static void main (String[] args) {                                           // Метод "main".
        Cat Vanya = new Cat();                                                          // Создаём объект типа Cat Сохраняем объект в переменную Vanya с типом Cat.
        Vanya.name = "Vanya";                                                           // Заполняем объект данными: имя,
        Vanya.age = 6;                                                                  // возраст,
        Vanya.weight = 7;                                                               // вес,
        Vanya.strength = 5;                                                             // сила.
                                                                                        //
        Cat Bars = new Cat();                                                           // Создаём объект типа Cat Сохраняем объект в переменную Bars с типом Cat.
        Bars.name = "Bars";                                                             // Заполняем объект данными: имя,
        Bars.age = 8;                                                                   // возраст,
        Bars.weight = 5;                                                                // вес,
        Bars.strength = 3;                                                              // сила.
                                                                                        //
        Vanya.fight(Bars);                                                              // Взаимодействие объектов. Vanya атакует Bars.
        Bars.fight(Vanya);                                                              // Взаимодействие объектов. Bars атакует Vanya.
    }                                                                                   // Тело метода "main" заканчивается.
    public boolean fight(Cat anotherCat) {
        int vanyaRating = (this.strength + this.weight) / this.age;                     // Вычисление рейтинга Vanya, он равен(сила+вес)/возраст.
        int  barsRating = (anotherCat.strength + anotherCat.weight) / anotherCat.age;   // Вычисление рейтинга Bars, он равен(сила+вес)/возраст.
                                                                                        //
        if(vanyaRating > barsRating) {return true;}                                     // Если рейтинг Vanya больше то вернуть "true".
        else if (vanyaRating < barsRating) {return false;}
        else {return false;}
    }
}