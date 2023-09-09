public class random_100_200_even {

    static int randomIntinRange(int a, int b) {
        int r = (int) (Math.random()*(b-a)+a);
        return r;
    }

    static int randomIntinRange_even(int a, int b) {
        int tmpA = a/2;
        int tmpB = b/2;
        int r = (int) (Math.random()*(tmpB-tmpA)+tmpA) * 2;
        return r;
    }
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(randomIntinRange(100,200));

        }
        System.out.println("---------------------------------------------------");
        for (int i = 0; i < 100; i++) {
            System.out.println(randomIntinRange_even(100,200));

        }
    }
}
