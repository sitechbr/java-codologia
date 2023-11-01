
public class Main {
    public static void upNum(int n) {
        if (n>0) {
            upNum(n-1);
            System.out.println(n);
        }
    }


    public static void main(String[] args) {
        upNum(5);
    }
}