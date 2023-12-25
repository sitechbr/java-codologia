import java.util.ArrayList;
public class PeopleQueue extends Thread{
    protected String[] names;

    PeopleQueue(String... names) {// Конструктор, аргумент- массив имен сотрудников
        this.names = names;
    }



    public void run() { // Этот метод будет вызван при старте потока
        for (int i = 0; i < names.length; i++) { // Вывод в цикле с паузой 0.5 сек очередного сотрудника
            System.out.println("Обработаны документы: " + names[i]);
            try {
                sleep(3000); // Задержка в 0.5 сек
            } catch (Exception e) {}
        }
    }
}
