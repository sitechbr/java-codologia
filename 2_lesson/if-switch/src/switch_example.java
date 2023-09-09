import java.util.Random;

public class switch_example {
    public static void main(String[] args) {
        Random r = new Random();
        short n = (short) r.nextInt(1,5);

        switch (n) {
            case 1:
                System.out.println("Один");
                break;
            case 2:
                System.out.println("Два");
                break;
            case 3:
                System.out.println("Три");
                break;
            case 4:
                System.out.println("Четыре");
                break;
            case 5:
                System.out.println("Пять");
                break;
            default:
             System.out.println("Я не знаю такого числа");
        }
    }
}
