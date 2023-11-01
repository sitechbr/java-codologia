public class random_1_10 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            int rand = (int)(Math.random()*10+1);
            System.out.printf("Случайное число от 1 до 10: %s\n", rand);

        }
    }
}
