public class DogPro {
    private String name="Unknow";
    private int age=1;
    private String color ="Red";

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        if (age >= 0 && age <19) {
            this.age=age;
        }
        if (age<0 || age >=19) {
            System.out.println("Возраст собаки указан не верно");
        }
    }

    public int getAge() {
        return this.age;
    }

}
