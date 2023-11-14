import javax.sound.midi.Soundbank;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static final String WORDLIST1 = "wordlistOne.txt";
    static final String WORDLIST2 = "wordlistTwo.txt";
    static final String WORDLIST3 = "wordlistThree.txt";

    public static String ReadOneStringOfFile(String filename) {
        String line = "";
        try {
            FileReader read = new FileReader(filename);
            BufferedReader br = new BufferedReader(read);
            line = br.readLine();

        } catch (IOException e) {
            System.out.printf("Ошибка чтения файла, возможно файл %s не существует\n", filename);
        }
        return line;
    }

    public static void main(String[] args) {
        //System.out.println(ReadOneStringOfFile(WORDLIST1));
        String wordlineOne = ReadOneStringOfFile(WORDLIST1);
        String wordlineTwo = ReadOneStringOfFile(WORDLIST2);
        String wordlineThree = ReadOneStringOfFile(WORDLIST3);
        String[] wordlistOne = wordlineOne.split(",");
        String[] wordlistTwo = wordlineTwo.split(",");
        String[] wordlistThree = wordlineThree.split(",");
        //System.out.println(wordlistOne.length);
        int rand1 = (int) (Math.random()*wordlistOne.length);
        int rand2 = (int) (Math.random()*wordlistTwo.length);
        int rand3 = (int) (Math.random()*wordlistThree.length);

        System.out.printf("Все что нам нужно, - это %s %s %s\n",wordlistOne[rand1],wordlistTwo[rand2],wordlistThree[rand3]);
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }
}