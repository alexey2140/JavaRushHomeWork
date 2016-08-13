package com.javarush.test.level05.lesson07.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота).
Создать для него как можно больше методов initialize(…)
Примеры:
1 -	заданы 4 параметра: left, top, width, height
2 -	ширина/высота не задана (оба равны 0)
3 -	высота не задана (равно ширине) создаём квадрат
4 -	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    int Rectop;
    int Recleft;
    int Recwidth;
    int Recheight;


    public void initialize(int top, int left, int width, int height)                    // 1
    {
        this.Rectop = top;
        this.Recleft = left;
        this.Recwidth = width;
        this.Recheight = height;
    }

    public void initialize(int top, int left)                                           // 2
    {
        this.Rectop = top;
        this.Recleft = left;
        this.Recwidth = 0;
        this.Recheight = 0;
    }

    public void initialize(int top, int left, int width)                                // 3
    {
        this.Rectop = top;
        this.Recleft = left;
        this.Recwidth = width;
        this.Recheight = width;
    }

    public void initialize(Rectangle anotherRectangle )                                // 4
    {
        this.Rectop = anotherRectangle.Rectop;
        this.Recleft = anotherRectangle.Recleft;
        this.Recwidth = anotherRectangle.Recwidth;
        this.Recheight = anotherRectangle.Recheight;
    }

}
