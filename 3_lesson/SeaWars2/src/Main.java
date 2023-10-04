import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static int[] genField(int size, int countSheet) {
        int[] field = new int[size];
        Random rand = new Random();
        int count = 0;
        while (count < countSheet) {
            int pos = rand.nextInt(0,size);
            if (field[pos] != 1) {
                field[pos] = 1;
                //count=count+1;
                //count+=1;
                count++;
            }
        }
        return field;
    }

    static int showUserStatus(int[] field) {
        int count =0;
        for (int pos: field) {
            if (pos==2) {
                count++;
            }
            //System.out.print(pos+ " ");
            System.out.printf("%s ", pos);
        }
        return count;
    }

    static int[] shootingAndCheck(int[] field,int count) {
        System.out.printf("\nВведите координату %s корабля\n", count+1);
        Scanner s = new Scanner(System.in);
        int pos = s.nextInt();
        if (field[pos]==1 || field[pos] == 2) {
            field[pos]=2;
            System.out.println("Попадание по кораблю");
        }
        else {
            field[pos] = 3;
            System.out.println("Промах");
        }
        return field;
    }

    public static void main(String[] args) {
        int size = 10;
        int countSheet = 3;
        System.out.println("| -----------------|");
        System.out.println("| Игра морской Бой |");
        System.out.println("|------------------|");
        int[] fieldEnemy = genField(size,countSheet);

        int count = 0;
        while(count < countSheet) {
            count = showUserStatus(fieldEnemy);
            if (count == 3) {
                break;
            }
            fieldEnemy = shootingAndCheck(fieldEnemy,count);
        }
        System.out.println("Вы победили");

    }
}