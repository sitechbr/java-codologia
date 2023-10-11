import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String,String> auth = new HashMap<String,String>();
        auth.put("User1","Password1");
        auth.put("User2","Password2");
        auth.put("User3","Password3");
        auth.put("User4","Password4");
        Scanner s = new Scanner(System.in);
        System.out.println("Введите имя пользователя");
        String user  = s.nextLine();
        System.out.println("Введите пароль");
        String password = s.nextLine();

        if (auth.containsKey(user)) {
            if (auth.get(user).equals(password) ) {
                System.out.println("Success");
            }
            else {
                System.out.println("Failed");
            }
        }
        else {
            System.out.println("Unknown user");

        }
    }
}