import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.SortedMap;

public class IntrerfaceAuth {
    public static Map<String,String> auth = new HashMap<String,String>();

    public static void register(String user, String password) {
        if (auth.containsKey(user)) {
            System.out.println("User already exist");
        }
        else {
            auth.put(user,password);
            System.out.printf("User \'%s\' added\n", user);
        }
    }

    public static void signin(String user, String password) {


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

    public static void deleteUser(String user) {
        if (auth.containsKey(user)) {
            auth.remove(user);
            System.out.println("user deleted");
        }else{
            System.out.println("Unknown user ");
        }


    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       while (true) {
           System.out.println("User managed interface");
           System.out.println("Enter 1 - Added user");
           System.out.println("Enter 2 - Delete user");
           System.out.println("Enter 3 - Sign In");
           System.out.println("Enter 0 - Exit");

           int ch = Integer.parseInt(s.nextLine());
           String user;
           String password;
           switch (ch) {
               case 1:
                   System.out.println("Input username");
                   user  = s.nextLine();
                   System.out.println("Input password");
                   password = s.nextLine();
                   register(user,password);
                   break;
               case 2:
                   System.out.println("Input username");
                   user  = s.nextLine();
                   deleteUser(user);


               case 3:
                   System.out.println("Input username");
                   user  = s.nextLine();
                   System.out.println("Input password");
                   password = s.nextLine();
                   signin(user,password);
                   break;

           }
           if (ch==0) {
               break;
           }



       }


    }
}
