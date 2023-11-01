import java.util.Scanner;

public class SQRT_example {
    static public void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("ВВедите число из которого требуется извлечь квадратный корень");
        int a = s.nextInt();
        System.out.printf("Квадратный корень равен: %s",Math.sqrt(a));
    }
}
