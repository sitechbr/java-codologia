
public class Main {
    public static void main(String[] args) {
        Integer i = 10;
        String strI = i.toString(); //Преобразование класса Integer  в строку
        System.out.println(strI+strI);
        int k = 11;
        String str2 = Integer.toString(k); // Преобразование примитивного типа int в строку
        System.out.println(str2+str2);


        String testStr = "12";
        int testInt = Integer.parseInt(testStr); // преобразование строки в Int
        System.out.println(testInt+testInt);
    }
}