public class One {
    public static void main(String[] args) {
        String myString = "This is my test string";
        System.out.println(myString.charAt(2));
        System.out.println(myString.charAt(myString.length()-2));
        System.out.println(myString.substring(0,5));
        System.out.println(myString.substring(0,myString.length()-2));
        for (int i = 0; i < myString.length(); i+=2) {
            System.out.print(myString.charAt(i));
        }
        for (int i = 1; i < myString.length(); i+=2) {
            System.out.print(myString.charAt(i));
        }
        for (int i = myString.length()-1; i >= 0 ; i--) {
            System.out.print(myString.charAt(i));

        }
        String[] result = myString.split(" ");
        System.out.println(result.length);

        String myString2 = "1 plus 1 razno 2";
        System.out.println(myString2.replaceAll("1", "one"));
        String email = "sitech.br@gmail.com";
        System.out.println(email.replaceAll("\\.",""));

    }
}
