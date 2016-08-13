/*package com.javarush.test.level06.lesson11.home05;

/* Есть новые идеи? Подумаем...
1. В классе Solution создать public статический класс Idea
2. В классе Idea создать метод public String getDescription(), который будет возвращать любой непустой текст
3. В классе Solution создайте статический метод public void printIdea(Idea idea), который будет выводить
на экран описание идеи - это то, что возвращает метод getDescription
*/
/*
public class Solution {
    public static void printIdea(Idea idea) {                           // как это вообще работает ??? тексттекст текст, какой то текст pringIdea(
        System.out.println(s);                                          // КАК?
    }

    public static void main(String[] args) {                            // Что здесь вообще происходит? Какая Idea ?
        printIdea(new Idea());
    }

    public static class Idea {
        public String getDescription() {                        // ... любой не пустой текст, значит он сюда как то должен попадать
            return s;                                           // затем проверка на то что он НЕ пустой, передача его в некую
        }                                                       // переменную и возврат через return s например
    }
}
/*
public class Solution {                                         // У нас есть класс Solution он состоит из метода printIdea метода main и класса Idea
    public static void printIdea(Idea idea) {                   // метод printIdea получает КАКОЙ ТО ТЕКСТ! от класса Idea и выводит его на экран
        System.out.println(s);                                  //
    }

    public static void main(String[] args) {                    // метод main вызывает метод printIdea с параметром создания
        printIdea(new Idea());                                  // нового объекта класса Idea
    }

    public static class Idea {
        public String getDescription() {                        // класс Idea при создании объекта его класса будет выполнять getDescription()
  //сюда приходит текст, проходит валидацию, и передается в переменную s//// и возвращать КАКОЙ ТО ТЕКСТ!! ЧТО??
            return s;                                           // потом мы должны вернуть этот текст в метод printIdea что бы он его вывел на экран
        }                                                       // ЧТО???
    }
    */
