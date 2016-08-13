package com.javarush.test.level06.lesson11.home04;

/* Минимальное количество static-ов
Расставьте минимальное количество static-ов, чтобы код начал работать, и программа успешно завершилась
*/

public class Solution
{
    public static int step;                       // ЗАЧЕМ делать int step STATIC ??????????????????????????????????????
                                                  // Не потому ли, что method4 обращается к ней напрямую как step++; а не this.step++; ?????
    public static void main(String[] args) {      // статический метод main вызывает статический method1
        method1();
    }

    public static void method1() {                // статический method1 вызывает статический method2
        method2();
    }


    public static void method2() {                // статический method2 вызывает НЕ статический method3
        new Solution().method3();                 // через создание обьекта
    }

    public void method3() {                       // НЕ статический method3 вызывает НЕ статический method4
        method4();
    }

    public void method4() {                       // НЕ статический method4 работает с переменной int step
        step++;
        for (StackTraceElement element : Thread.currentThread().getStackTrace())
            System.out.println(element);
        if (step > 1) return;
        main(null);
    }
}
