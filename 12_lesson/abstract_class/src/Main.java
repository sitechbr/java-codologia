
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.



public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("This is my program about vehicle\n");
        System.out.println("----------------------------------------");

        BMW m1 = new BMW("M3", "o111oo11");
        m1.startMoving();
        m1.startEngie();
        m1.transportingPeople();
        System.out.println("----------------------------------------");

        Kamaz m2 = new Kamaz("5420","o2222oo11");
        m2.startMoving();
        m2.startEngie();
        m2.loadCargo();
        System.out.println("----------------------------------------");

        Volvo m3  = new Volvo("FMX", "o333oo11");
        m3.startMoving();
        m3.startEngie();
        m3.loadCargo();
        System.out.println("----------------------------------------");

    }
}