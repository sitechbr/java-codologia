// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       String myString = "ThisIsTestString";
        System.out.println(myString.substring(2,3));
        System.out.println(myString.substring(myString.length()-1,myString.length()));
        System.out.println(myString.substring(0,5));
        for (int i = 1; i < myString.length(); i+=2) {
            System.out.print(myString.charAt(i));
        }
        System.out.println();
        for (int i = 0; i < myString.length(); i+=2) {
            System.out.print(myString.charAt(i));
        }
        System.out.println();
        for (int i = myString.length()-1; i >= 0; i--) {
            System.out.print(myString.charAt(i));
        }
        System.out.println();

        System.out.println(myString.length());


    }
}