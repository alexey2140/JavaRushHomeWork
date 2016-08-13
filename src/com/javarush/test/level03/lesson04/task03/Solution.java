package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Zerg zerg1 = new Zerg();
        zerg1.name = "Zerk11";
        Zerg zerg2 = new Zerg();
        zerg2.name = "Zerk2";
        Zerg zerg3 = new Zerg();
        zerg3.name = "Zerk3";
        Zerg zerg4 = new Zerg();
        zerg4.name = "Zerk4";
        Zerg zerg5 = new Zerg();
        zerg5.name = "Zerk5";
        Zerg zerg6 = new Zerg();
        zerg6.name = "Zerk6";
        Zerg zerg7 = new Zerg();
        zerg7.name = "Zerk7";
        Zerg zerg8 = new Zerg();
        zerg8.name = "Zerk8";
        Zerg zerg9 = new Zerg();
        zerg9.name = "Zerk9";
        Zerg zerg10 = new Zerg();
        zerg10.name = "Zerk10";

        Protos pro1 = new Protos();
        pro1.name = "Prot1";
        Protos pro2 = new Protos();
        pro2.name = "Prot2";
        Protos pro3 = new Protos();
        pro3.name = "Prot3";
        Protos pro4 = new Protos();
        pro4.name = "Prot4";
        Protos pro5 = new Protos();
        pro5.name = "Prot5";


        Terran terr1 = new Terran();
        terr1.name = "Terra1";
        Terran terr2 = new Terran();
        terr2.name = "Terra2";
        Terran terr3 = new Terran();
        terr3.name = "Terra3";
        Terran terr4 = new Terran();
        terr4.name = "Terra4";
        Terran terr5 = new Terran();
        terr5.name = "Terra5";
        Terran terr6 = new Terran();
        terr6.name = "Terra6";
        Terran terr7 = new Terran();
        terr7.name = "Terra7";
        Terran terr8 = new Terran();
        terr8.name = "Terra8";
        Terran terr9 = new Terran();
        terr9.name = "Terra9";
        Terran terr10 = new Terran();
        terr10.name = "Terra10";
        Terran terr11 = new Terran();
        terr11.name = "Terra11";
        Terran terr12 = new Terran();
        terr12.name = "Terra12";
    }

    public static class Zerg
    {
        public String name;
    }

    public static class Protos
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }
}