import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static int[] genField(int size,int countSheet) {
        int[] field = new int[size];
        Random r = new Random();
        int count = 0;
        while (count<countSheet) {
            int pos = r.nextInt(0,size);
            if (field[pos]!=1) {
                field[pos] =1;
                count +=1;
            }
        }
        return field;
    }

    static int showUserStatus(int[] field) {
        int count =0;
        for (int pos: field) {
            System.out.print('|');
            if (pos == 1) {
                System.out.print('k');
            } else if (pos == 0) {
                System.out.print('?');
            }
            else if (pos == 2) {
                System.out.print('*');
                count++;
            }
            else {
                System.out.print('.');
            }

            System.out.print('|');


        }
        return count;
    }

    static int[] shooting_and_cheak(int[] field, int countSheet) {
        System.out.printf("\nВведине координатору %s корабля\n", countSheet+1);
        Scanner s = new Scanner(System.in);
        int pos = s.nextInt();
        if (field[pos] == 1 || field[pos] == 2  ){
            field[pos] = 2;
            System.out.println("Попадание по кораблю");

        } else {
            field[pos] = 3;
            System.out.println("Промах");

        }
        return field;
    }
    public static void main(String[] args) {
        System.out.println("Игра морской бой");
        int[] fieldEnemy = genField(10,3);
        int count = 0;
        while (count < 3) {
            count = showUserStatus(fieldEnemy);
            fieldEnemy = shooting_and_cheak(fieldEnemy,count);

        }

        System.out.println("Вы победели");

    }
}