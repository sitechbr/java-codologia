import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("------------------");
        System.out.println("|   Игра чепуха   |");
        System.out.println("------------------");

        Scanner s = new Scanner(System.in);

        System.out.println("ВВедите цвет:");
        String color = s.nextLine();
        System.out.println("ВВедите существительное:");
        String name = s.nextLine();
        System.out.println("ВВедите глагол:");
        String verb = s.nextLine();


        String[] Template = {"%s %s %s платье","%s %s %s свитер","%s %s %s кошку","%s %s %s на кровать","%s %s %s стол"};
        short sw = (short) Math.round(Math.random()*5);
        System.out.printf(Template[sw],color,name,verb);





    }
}