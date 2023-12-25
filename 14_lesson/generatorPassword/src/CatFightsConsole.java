import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CatFightsConsole {
    // Точка входа в программу, Main Thread
    public static void main(String[] args){
        // Title
        System.out.println("Cat Fights Console");

        // Создаём контейнер с котами
        List<Cat> catThreads = new ArrayList<>();
        // Жизни котов
        int life = 9;

        // Создаём и настраиваем классы-потоки котов, добавляя их в контейнер
        Collections.addAll(catThreads,
                new Cat("Tom", life, "Thread Tom"),
                new Cat("Cleocatra", life, "Thread Cleocatra"),
                new Cat("Dupli", life, "Thread Dupli"),
                new Cat("Toodles", life, "Thread Toodles"));

        // Запускаем котов
        for(Cat cat : catThreads)
            cat.getThread().start();

        // Ждём, пока завершатся все, кроме главного
        for(Cat cat : catThreads){
            try{
                // Поток, который вызвал метод join(), приостанавливается на этой строчке
                cat.getThread().join();
                // Пока поток, на котором вызван метод, не завершит работу, Main ждёт остальных
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        // Последний выживший — первый элемент cats
        System.out.println(String.format("Кот-победитель: %s!!!", Cat.cats.get(0)));
    }
}