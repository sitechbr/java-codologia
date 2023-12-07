
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        ShipPosition p1;
        try {
            p1 = new ShipPosition(4,2);
            p1.getPos();
        } catch (Exception e) {
            System.out.println("Bad position");
        }

        ShipPosition p2 = null;
        try {
            p2 = new ShipPosition(5,12);
            p2.getPos();
        } catch (Exception e) {
            System.out.println("Bad position");

        }


        Ship s1 = new Ship(2);
        s1.setPaluba();



    }
}