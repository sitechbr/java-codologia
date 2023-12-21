
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Vehicle project\n");
        System.out.println("----------------------------");
        //Vehicle test1 = new Vehicle();
        Kamaz car1 = new Kamaz("4350", "O111OO11");
        car1.loadCargo();
        car1.startMoving();
        car1.starEngine();
        System.out.println("----------------------------");


    }
}