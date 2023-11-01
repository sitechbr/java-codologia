public class requrs {
    public static void numbersMax(int start, int end) {

        if (start <= end) {
            numbersMax(start, end - 1);
            System.out.println(end);
        }

    }

    public static void numbersMin(int start, int end) {
        if (start >= end) {
            numbersMin(start, end+1);
            System.out.println(end);
        }

    }

    public static void main(String[] args) {
        int a =5;
        int b =2;
        if (a<b) {
            numbersMax(a,b);
        }
        if (b<a) {
            numbersMin(a,b);

        }
        if (a==b) {
            System.out.println(a);
        }
    }
}
