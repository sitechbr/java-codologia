import java.util.Scanner;
import java.util.regex.Matcher;

public class Player {
  int guessp=0;
  boolean pisRight = false;

  public  void guess() {
    System.out.println("Введите число от 0 до 9");
    Scanner s = new Scanner(System.in);
    this.guessp=s.nextInt();
  }

  public void rundGuess() {
    this.guessp = (int) (Math.random() * 10);
    System.out.printf("Думаю, это число %s\n",this.guessp);
  }
};
