import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int firstNum = random.nextInt(100);
        int secondNum = random.nextInt(100);
        int proizv = firstNum*secondNum;
        System.out.println("Какие числа нужно умножить чтоб получить " + Integer.toString(proizv) );

        Scanner scanner = new Scanner(System.in);
        int firstUserNum = scanner.nextInt();
        int secondUserNum = scanner.nextInt();

        if (firstUserNum!=1 && secondUserNum!=1 && firstUserNum*secondUserNum==proizv) {
            System.out.println("Верно");
        }
        else System.out.println("Не верно");


    }
}