import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InterfaceAuth {
    public static File f = new File("Users.txt");
    public static Map<String,String> auth = new HashMap<String,String>();
    public static void register(String user,String password) {
        //System.out.println("User registered");
        if (auth.containsKey(user)) {
            System.out.println("User already exist");
        }
        else {
            auth.put(user,password);
            System.out.printf("User \'%s\' added",user);
        }
    }
    public static void signin(String user,String password) {
        if (auth.containsKey(user)) {
            if (auth.get(user).equals(password)) {
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
        //System.out.println("User deleted");
        if (auth.containsKey(user)) {
            auth.remove(user);
            System.out.println("User deleted");
        }
        else {
            System.out.println("Unknown user");
        }
    }

    public static void printMap() {
        for(String user: auth.keySet()){
            System.out.println("User: " + user);
        }
    }
    public static void writeFile(Map<String,String> auth) {
        try {
            PrintWriter pw = new PrintWriter(f);
            for(Map.Entry<String,String> user: auth.entrySet()) {
                //String login = user.getKey();
                pw.println(user);
            }
            pw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void readBase() {
        Map<String,String> users = new HashMap<String,String>();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("Users.txt"));
            String line = reader.readLine();
            while (line != null) {
                String[] user = line.split("=");
                auth.put(user[0],user[1]);
                line = reader.readLine();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        readBase();
        while(true) {
            System.out.println("User managed interface");
            System.out.println("1 - Added user");
            System.out.println("2 - Delete user");
            System.out.println("3 - SignIn");
            System.out.println("4 - PrintUser");
            System.out.println("0 - Exit");
            String ch = s.nextLine();
            String user;
            String password;
            switch (ch) {
                case "1":
                    System.out.println("Input username");
                    user  = s.nextLine();
                    System.out.println("Input password");
                    password = s.nextLine();
                    register(user,password);
                    break;
                case "2":
                    System.out.println("Input username");
                    user  = s.nextLine();
                    deleteUser(user);
                    break;
                case "3":
                    System.out.println("Input username");
                    user  = s.nextLine();
                    System.out.println("Input password");
                    password = s.nextLine();
                    signin(user,password);
                    break;
                case "4":
                    printMap();
                    break;
                default:
                    System.out.println("Unknown command");
            }
            if (ch=="0") {
                break;
            }
            writeFile(auth);
        }
    }
}
