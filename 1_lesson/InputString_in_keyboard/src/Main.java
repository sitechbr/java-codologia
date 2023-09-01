import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine(); //считывание строки
        int pages = scanner.nextInt(); //cчитывание числа

        System.out.println(title);
        System.out.println(pages + 1);
    }
}