package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        String exit = "exit";

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName = reader.readLine();
        Writer writer = new FileWriter(fileName);

        while (true) {

            String temp = reader.readLine();
            if (temp.equals(exit)) {
                writer.write(exit);
                break;
            }
            else {
                writer.write(temp);
                writer.write(System.getProperty("line.separator"));

            }
        }
        writer.flush();
        writer.close();
        reader.close();
    }
}