
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Dog dryzhok = new Dog();
        dryzhok.age=14;
        dryzhok.name = "Dryzhok";
        dryzhok.color = "Black";
        dryzhok.say();
        DogPro lars = new DogPro("Lars");
        lars.say();
        System.out.printf("Age: %s\n", lars.getAge());
        if (lars.setAge(-1)==1) {
            System.out.println("Input Age, incorrect data");
        }

        System.out.printf("Age: %s\n", lars.getAge());
        if (lars.setAge(16)==1) {
            System.out.println("Input Age, incorrect data");
        }
        System.out.printf("Age: %s\n", lars.getAge());



    }
}