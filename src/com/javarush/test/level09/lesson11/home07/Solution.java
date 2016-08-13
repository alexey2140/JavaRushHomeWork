package com.javarush.test.level09.lesson11.home07;

/* Расставь модификаторы static
Расставь модификаторы static так, чтобы пример скомпилировался.
*/

public class Solution {
    public static  int A = 5;     // 5
    public static  int B = 2 * A; // 2 *  5 = 10
    public  int C = A * B;        // 5 * 10 = 50
    public static  int D = A * B; // 5 * 10 = 50

    public void main(String[] args)
    {
        Solution room = new Solution();
        room.A = 5;

        Solution.D = 5;
    }

    public int getA()
    {
        return A;
    }
}