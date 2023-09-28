// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static int randomRange(int min,int max) {
        return (int) (Math.random()*((max-min)+1))+min;
    }

    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        for (int i = 0; i < 20; i++) {
            System.out.println(randomRange(2,10));
        }


        // Press Shift+F10 or click the green arrow button in the gutter to run the code.

    }
}