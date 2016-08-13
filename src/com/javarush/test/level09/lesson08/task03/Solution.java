package com.javarush.test.level09.lesson08.task03;
import java.io.CharConversionException;
import java.io.IOException;
import java.nio.file.FileSystemException;
/* Перехват выборочных исключений
1. Разберись, какие исключения бросает метод BEAN.methodThrowExceptions.
2. Метод processExceptions должен вызывать метод BEAN.methodThrowExceptions и обрабатывать исключения:
2.1. если возникло исключение FileSystemException, то логировать его (вызвать метод BEAN.log) и пробросить дальше
2.2. если возникло исключение CharConversionException или любое другое IOException, то только логировать его - вызвать метод BEAN.log
3. Добавь в сигнатуру метода processExceptions класс исключения, которое ты пробрасываешь в п.2.1.
4. В методе main обработай оставшееся исключение - логируй его. Используй try..catch
Подсказка:Если ты захватил исключение MyException, которое не хотел захватывать, его можно пробросить дальше кодом вида:
catch (MyException e) {throw e;}*/                          // что это за подсказка?? В чем её суть? Я всегда хочу захватить исключение, что за бред?
public class Solution {
    public static StatelessBean BEAN = new StatelessBean();

    public static void main(String[] args) { // 4. В методе main обработай оставшееся исключение - логируй его. Используй try..catch
        try {                                // ???????? КАКОЕ ОСТАВШЕЕСЯ ИСКЛЮЧЕНИЕ ???????? Если мы перечислили все которые у нас были???
            processExceptions();
        }
        catch (IOException e) {           // Тут логировать оставшееся исключение (п.4) КАКОЕ??? Оставшееся из ЧЕГО?? Все 3 класса исключений уже использованы!
            BEAN.log(e);                  // Сначала я добавлял сюда FileSystemException так как оно пробрасывается сюда из processExceptions  и можно было
        }                                 // интерпретировать его как оставшееся, НО НЕТ! ЧЕЛОВЕК МНЕ НУЖЕН IOException!!!
    }

    public static void processExceptions() throws FileSystemException { // 3. Добавь в сигнатуру метода processExceptions класс исключения, которое ты пробрасываешь в п.2.1.
        try {
            BEAN.methodThrowExceptions();
        }
        catch (FileSystemException e) {     // 2.1. если возникло исключение FileSystemException, то логировать его (вызвать метод BEAN.log) и пробросить дальше
            BEAN.log(e);                    // если для того что бы пробросить нужно throw e; то почему оно не было нужно раньше? раньше было достаточно сигнатуры метода
            throw e;                        // Тут надо было добавить throw e; ЗАЧЕМ?? В JR написано что что бы пробросить достаточно добавить класс исключения в сигнатуру метода
        }
        catch (CharConversionException e) { // 2.2. если возникло исключение CharConversionException или любое другое IOException, то только логировать его - вызвать метод BEAN.log
            BEAN.log(e);
        }                                   // IDEA говорит что ветка catch CharConversionException входит в IOException, смысла в ней нет. Зачем тогда её требут в условии? п2.2
        catch (IOException e) {             // 2.2. если возникло исключение CharConversionException или любое другое IOException, то только логировать его - вызвать метод BEAN.log
            BEAN.log(e);
        }
    }

    public static class StatelessBean {
        public void log(Exception exception) {                                                                  // Метод логирования, его изменять не надо
            System.out.println(exception.getMessage() + ", " + exception.getClass().getSimpleName());           // просто вызвать несколько раз по условию
        }

        public void methodThrowExceptions() throws CharConversionException, FileSystemException, IOException {  // Метод выбрасывания exception, его трогать не надо
            int i = (int) (Math.random() * 3);                                                                  // отсюда рандомно прилетает один из 3х классов exception
            if (i == 0)                                                                                         // при том что 2 из 3 являются субклассом
                throw new CharConversionException();                                                            // лучше было бы убрать или 1и2 или 3
            if (i == 1)                                                                                         // в условии об этом не сказано, ну да ладно
                throw new FileSystemException("");
            if (i == 2)
                throw new IOException();
        }
    }
}




// пока я писал все это от того что у меня прибомбило от условия, пришла в голову такая идея: в методе processExceptions() у нас по сути передается ТОЛЬКО IOException
// потому что FileSystemException мы выбрасываем с помощью команды throw e; , CharConversionException входит в IOException, а IOException и есть само IOException.
// Так вот! и до метода main всегда доходит только IOException, там то мы его и логируем, но отсюда вопрос, зачем его логировать ЕЩЕ РАЗ??, и зачем тогда пробрасывать
// FileSystemException и писать в сигнатуру метода это : "throws FileSystemException" ???