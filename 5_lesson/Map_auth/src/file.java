import java.io.*;

public class file {
    public static void main(String[] args) {
        File file = new File("example.txt");
        try {
            PrintWriter pw = new PrintWriter(file);
            pw.println("My file");
            pw.println("first string");
            pw.println("second string");
            pw.println("thread string");

            pw.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            FileReader read = new FileReader("example.txt");
            BufferedReader br = new BufferedReader(read);
            String line = br.readLine();
            while(line != null) {
                System.out.println(line);
                line = br.readLine();

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }







    }
}
