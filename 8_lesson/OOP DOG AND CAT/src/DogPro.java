public class DogPro {
    private String name="Unknow";
    private int age = 1;
    private String color = "Black";

    public DogPro(String name) {
        this.name = name;

    }

    public DogPro(String name,int age) {
        this.age = age;
        this.name = name;

    }

    public DogPro(String name,int age, String color) {
        this.color = color;
        this.name = name;
        this.age = age;

    }

    public int getAge() {
        return this.age;
    }

    public int setAge(int age) {
        if (age > 0 && age <18) {
            this.age = age;
            return 0;
        }
        else return 1;

    }

    public void say() {
        System.out.printf("Name: %s\nAge: %s\nColor: %s\n",this.name,this.age,this.color);

    }

}
