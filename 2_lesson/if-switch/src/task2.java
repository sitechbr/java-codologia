import java.util.Random;
import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {
        Random r = new Random();
        short rand_numb = (short) r.nextInt(1, 5);
        Scanner s = new Scanner(System.in);
        System.out.println("ВВедите загаданное число");
        int n = s.nextInt();
        System.out.println(n==rand_numb?"Вы угадали":"Нет вы не угадали");
    }
}

