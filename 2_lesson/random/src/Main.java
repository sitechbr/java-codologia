import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Random types");

        System.out.println("Type one:");
        Random random = new Random();
        int rand = random.nextInt(10);
        System.out.println(rand);
        System.out.println("Type two:");
        int rand_rang = random.nextInt(10,20);
        System.out.println(rand_rang);
        System.out.println("Type three:");
        int rand_math = (int)(Math.random()*100)+1;
        System.out.println(rand_math);
        System.out.println("Type four:");
        char rand_char  = (char)(random.nextInt(26) + 'A');
        System.out.println(rand_char);







    }
}