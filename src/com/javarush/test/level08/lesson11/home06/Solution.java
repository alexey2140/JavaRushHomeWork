package com.javarush.test.level08.lesson11.home06;
/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> kids= new ArrayList<Human>();
        Human kid1 = new Human("Игорь", true, 2, new ArrayList<Human>());
        Human kid2 = new Human("Олег", true, 3, new ArrayList<Human>());
        Human kid3 = new Human("Софи", false, 6, new ArrayList<Human>());
        kids.add(kid1); kids.add(kid2); kids.add(kid3);

        ArrayList<Human> fNm= new ArrayList<Human>();
        Human father = new Human("Михаил", true, 28, kids);
        Human mother = new Human("Аня", false, 21, kids);
        fNm.add(father); fNm.add(mother);


        Human gF1 = new Human("Павел", true, 54, fNm);
        Human gF2 = new Human("Валерий", true, 46, fNm);
        Human gM1 = new Human("Катя", false, 55, fNm);
        Human gM2 = new Human("Таня", false, 44, fNm);

        System.out.println(gF1);
        System.out.println(gF2);
        System.out.println(gM1);
        System.out.println(gM2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(kid1);
        System.out.println(kid2);
        System.out.println(kid3);


    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<Human>();

        public Human(String name,boolean sex , int age, ArrayList<Human> children) {
        setName(name);
        setSex(sex);
        setAge(age);
        setKid(children);
    }

        public void setName(String name) {
            if (name.length() < 1 || name.equals(" ")) {
                System.out.println("Введите хотя бы 1 символ");
            }
            else {
                this.name = name;
            }
        }

        public void setSex(boolean sex) {
            this.sex = sex;

        }

        public void setAge(int age) {
            if (age < 0) {
                System.out.println("Возраст не может быть меньше 0");
            }
            else {
                this.age = age;
            }
        }

        public void setKid(ArrayList<Human> children) {
            this.children = children;
        }




        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }
}
