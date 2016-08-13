package com.javarush.test.level06.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: У каждой кошки есть имя и кошка-мама. Создать класс, который бы описывал данную ситуацию.
Создать два объекта: кошку-дочь и кошку-маму. Вывести их на экран.
Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама. Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: дедушку(папин папа), бабушку(мамина мама), папу, маму, сына, дочь.
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
Cat name is дедушка Вася, no mother, no father
Cat name is бабушка Мурка, no mother, no father
Cat name is папа Котофей, no mother, father is дедушка Вася
Cat name is мама Василиса, mother is бабушка Мурка, no father
Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей
Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
*/

public class Solution { public static void main(String[] args) throws IOException {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    Cat catDed = new Cat(reader.readLine());
    Cat catGranny = new Cat(reader.readLine());
    Cat catFather = new Cat(reader.readLine(), catDed, null);     // null потому что бабушка(мамина мама), а дедушка(папин папа)
    Cat catMother = new Cat(reader.readLine(),null, catGranny);
    Cat catSon = new Cat(reader.readLine(), catFather, catMother);
    Cat catDaughter = new Cat(reader.readLine(),catFather, catMother);

    System.out.println(catDed); // println не может распечатать переменную с обьектом потому что у неё сложный тип данных
    System.out.println(catGranny); // при выводе без toString(), будет что то такое : com.javarush.test.level06.lesson11.bonus02.Solution$Cat@74a14482
    System.out.println(catFather); //                                                 com.javarush.test.level06.lesson11.bonus02.Solution$Cat@1540e19d
    System.out.println(catMother); //                                                 com.javarush.test.level06.lesson11.bonus02.Solution$Cat@677327b6
    System.out.println(catSon); // toString есть у каждого обьекта, прописывая новый toString мы перекрываем неявный toString
    System.out.println(catDaughter); // и по умолчанию эти все переменные слева превращаются в строки и sout принимает
}                                   // их как строки и выводит по правилам нового toString
    public static class Cat {

        private String name;
        private Cat mother;
        private Cat father;
        Cat(String name) {

            this.name = name;
        }
        Cat(String name, Cat father, Cat mother) {

            this.name = name;
            this.father = father;
            this.mother = mother;
        }
        @Override
        public String toString() // есть обьекты с данными, которые мы преобразуем в строку что бы вывести на экран. Как бы действовал обычный toString() в этом случае?
        {  // зачем тогда переопределять toString()?? @Override дает нам возможность просто писать в теле что мы хотим, но toString остается самим собой.
            if ((father == null)&&(mother == null))
                return "Cat name is " + name + ", no mother" + ", no father ";
            else
            {
                if ((father == null) && (mother!= null))
                    return "Cat name is " + name + ", mother is " + mother.name + ", no father";
                else
                {
                    if ((mother == null) && (father != null))
                        return "Cat name is " + name + ", no mother" + ", father is " + father.name;
                    else
                        return "Cat name is " + name + ", mother is " + mother.name + ", father is " + father.name;
                }
            }
        }
    }
}