
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        FamilyDoctor doctor1 = new FamilyDoctor();
        Surgeon doctor2 = new Surgeon();

        doctor1.name = "Bob";
        doctor2.name = "Sem";

        doctor2.treatPatient();
        doctor1.treatPatient();
        Doctor doctor3 = new Doctor();
        doctor3.name ="Kent";
        doctor3.treatPatient();


    }
}