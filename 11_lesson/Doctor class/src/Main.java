
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor();
        doctor1.name = "Bob";
        doctor1.treatPatient();

        FamilyDoctor doctor2 = new FamilyDoctor();
        doctor2.name="Den";
        doctor2.treatPatient();
        doctor2.giveAdvice();


        Surgeon doctor3 = new Surgeon();
        doctor3.name="Mark";
        doctor3.makeIncusion();
        doctor3.treatPatient();
    }
}