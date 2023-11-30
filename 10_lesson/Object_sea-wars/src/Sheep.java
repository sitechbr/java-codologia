import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class Sheep {
    private int health;
    private Vector<SheepPosition> paluba  = new Vector<SheepPosition>();

    Sheep(int lenSheep) {
        this.health = lenSheep;
        System.out.println("Created sheep");
    }

    public void setPaluba() {
        Scanner  s = new Scanner(System.in);
        for (int i = 0; i < this.health; i++) {
            System.out.printf("Input x possition %s paluby: ", i+1);
            int x = s.nextInt();
            System.out.printf("Input y possition %s paluby: ", i+1);
            int y = s.nextInt();
            try {
                this.paluba.add(new SheepPosition(x,y));
            }
                catch (Exception e) {
                    System.out.println("Miss Data");
                }
        }
    }
    public void generateSheep() {
        Random rand = new Random();
        int vh = rand.nextInt(0,2);
        if (vh==1) {
            int posx = rand.nextInt(10);
            int posy = rand.nextInt(0, 10 - this.health);
            for (int i = 0; i < this.health; i++) {
                try {
                    this.paluba.add(new SheepPosition(posx, posy + i));


                } catch (Exception e) {
                    System.out.println("Miss Data");
                }
            }
        }

        else {
            int posy = rand.nextInt(10);
            int posx = rand.nextInt(0, 10 - this.health);
            for (int i = 0; i < this.health; i++) {
                try {
                    this.paluba.add(new SheepPosition(posx+i, posy));


                } catch (Exception e) {
                    System.out.println("Miss Data");
                }
            }

        }

    }
    public void getPaluba() {
        for (int i = 0; i < this.paluba.size(); i++) {
            System.out.printf("Position %s paluba\n", i+1);
            this.paluba.get(i).getPos();

        }
    }
}
