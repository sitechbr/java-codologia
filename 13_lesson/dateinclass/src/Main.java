
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!\n");
        Date d1 = new Date(2,2,2);
        System.out.println(d1);
        System.out.println(d1.convert2day());
        d1.convert2date();
        System.out.println(d1);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Date d2 = new Date(32,16,2);
        System.out.println(d2);
        System.out.println(d2.convert2day());
        d2.convert2date();
        System.out.println(d2);


    }
}