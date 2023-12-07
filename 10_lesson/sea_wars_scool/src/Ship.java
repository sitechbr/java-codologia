import javax.sound.midi.Soundbank;
import java.util.Scanner;
import java.util.Vector;

public class Ship {
    private Vector<ShipPosition> paluba = new Vector<ShipPosition>();
    private int health;

    Ship(int lenShip) {
        this.health = lenShip;
    }

    public void setPaluba() {
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < this.health; i++) {
            System.out.printf("Input x position %s paluby: ", i+1);
            int x = s.nextInt();
            System.out.printf("Input y position %s paluby: ", i+1);
            int y = s.nextInt();
            try {
                this.paluba.add(new ShipPosition(x,y));
            } catch (Exception e) {
                System.out.println("Miss data");
            }

        }
    }

    public void setRundPaluba() {

    }
    public void getPaluba() {
        for (int i = 0; i < this.paluba.size(); i++) {
            System.out.printf("Position %s paluba \n", i+1);
            this.paluba.get(i).getPos();
        }
    }
 }
