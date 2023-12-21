public class Volvo extends Truck {
    Volvo(String itMake, String itNumber) {
        this.model = "volvo";
        this.number = itNumber;
        this.make = itMake;
        System.out.println("Volvo is built");
    }
    public void startMoving() {
        System.out.println("Volvo is driving slowly");
    }

}
}
