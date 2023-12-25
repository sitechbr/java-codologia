
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        PeopleQueue queue1 = new PeopleQueue("Иван","Сергей","Николай","Фердинанд","Василий");
        PeopleQueue queue2 = new PeopleQueue("Мария","Людмила","Алиса","Карина","Ольга");
        VipQueue queue3 = new VipQueue("Konstantin","Fedor","Tolya","Kirill","Sasha");

        System.out.println("Начали!"); // Сообщение из главного потока программы
        queue1.start();    //Запускаем одну очередь (дочерний поток)
        queue2.start(); //Запускаем вторую (дочерний поток)
        queue3.start();
    }
}