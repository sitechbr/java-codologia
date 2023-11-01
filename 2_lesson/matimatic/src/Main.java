import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите основание степени: ");
        int a = s.nextInt();
        System.out.print("Введите степень числа: ");
        int n = s.nextInt();
        System.out.printf("Результат возведения числа %s в степень %s: %s", a, n, Math.pow(a,n));


    }
}