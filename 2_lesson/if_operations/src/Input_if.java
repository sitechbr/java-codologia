import java.util.Random;
import java.util.Scanner;

public class Input_if {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //int n = scanner.nextInt();

        Random random = new Random();
        int n = random.nextInt(0,5);

        if (n == 1) {
            System.out.println("я загадал один");
        } else if (n==2) {
            System.out.println("Я загадал два ");
        } else if (n==3) {
            System.out.println("Я загадал три ");
        }else if (n==4) {
            System.out.println("Я загадал четыре ");
        }else if (n==5) {
            System.out.println("Я загадал пять ");
        }
        else {
            System.out.println("Я загадал 0");
        }



    }
}
