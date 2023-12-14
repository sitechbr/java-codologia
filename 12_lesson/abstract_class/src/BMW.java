public class BMW extends Car{
    BMW(String itMake,String itNumber) {
        this.model = "BMW";
        this.number = itNumber;
        this.make = itMake;
        System.out.println("BMW is built");
    }

    public void startMoving() {
        System.out.println("BMW is driving fast");
    }
}
