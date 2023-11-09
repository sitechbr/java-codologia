import java.io.*;
import java.util.SortedMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        File file = new File("example.txt");
        try {
            PrintWriter pw = new PrintWriter(file);
            pw.println("My file");
            pw.println("First line");
            pw.println("Second line");
            pw.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            FileReader read  = new FileReader("example.txt");
            BufferedReader br = new BufferedReader(read);
            String line = br.readLine();
            while(line!=null) {
                System.out.println(line);
                line = br.readLine();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}