
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Date class program!");
        Date d1 = new Date(29,12,2023);
        System.out.println(d1);
        int day = Date.date2day(d1);
        System.out.println(day);
        System.out.println(Date.day2date(day));


    }
}