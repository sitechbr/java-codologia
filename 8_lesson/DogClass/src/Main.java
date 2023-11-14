
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        DogPro belka = new DogPro();
        System.out.println(belka.getName());

        belka.setName("Belka");
        System.out.println(belka.getName());

        belka.setAge(-1);
        System.out.println(belka.getAge());
        belka.setAge(15);
        System.out.println(belka.getAge());


    }
}