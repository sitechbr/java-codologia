import javax.swing.text.Position;
import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        SheepPosition point1;
        try {
            point1 = new SheepPosition(4, 3);
            point1.getPos();
        }catch (Exception e) {

            System.out.println("Bad position");
        }
        SheepPosition point2;
        try {
            point2 = new SheepPosition(-4, 3);
            point2.getPos();
        }catch (Exception e) {

            System.out.println("Bad position");
        }
        Sheep mySheep = new Sheep(3);
        mySheep.generateSheep();
        //mySheep.setPaluba();
        mySheep.getPaluba();



    }
}