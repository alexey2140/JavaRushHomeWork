package com.javarush.test.level05.lesson09.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя конструкторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle
{
    int Cx;
    int Cy;
    int Crad;
    int Cwidth;
    String Ccolor;

    public Circle(int centerX, int centerY, int radius)                                 // 1
    {
        this.Cx = centerX;
        this.Cy = centerY;
        this.Crad = radius;
    }

    public Circle(int centerX, int centerY, int radius, int width)                      // 2
    {
        this.Cx = centerX;
        this.Cy = centerY;
        this.Crad = radius;
        this.Cwidth = width;
    }

    public Circle(int centerX, int centerY, int radius, int width, String color)        // 3
    {
        this.Cx = centerX;
        this.Cy = centerY;
        this.Crad = radius;
        this.Cwidth = width;
        this.Ccolor = color;
    }


}
