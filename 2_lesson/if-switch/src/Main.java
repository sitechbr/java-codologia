import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите первое число а=");
        int a = s.nextInt();
        System.out.print("Введите второе число b=");
        int b = s.nextInt();

        String z = a< b? "a меньше b" : "a не меньше b";
        System.out.println(z);

    }
}