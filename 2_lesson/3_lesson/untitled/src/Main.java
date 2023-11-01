import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random rand = new Random();
        String playAgain="";
        do {
            short compNumber = (short) rand.nextInt(0,10);
            System.out.println("Я загадал число от 0 до 10, попробуй угадать!");
            short count = 0;
            short myNumber = -1;

            while (myNumber!=compNumber) {
                count+=1;
                System.out.printf("Попытка %s: ",count);
                myNumber = s.nextShort();

            }

            System.out.printf("Вы угадали с %s попыток. Загаданное число: %s\n", count, myNumber);
            System.out.println("Хотите сыграть еше? (y or n)");
            playAgain = s.next();

        } while (playAgain.equalsIgnoreCase("y"));
        System.out.println("Конец игры");

    }
}