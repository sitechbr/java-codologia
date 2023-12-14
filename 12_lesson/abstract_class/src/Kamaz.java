public class Kamaz extends Truck{
    Kamaz(String itMake,String itNumber) {
        this.model = "kamaz";
        this.number = itNumber;
        this.make = itMake;
        System.out.println("Kamaz is built");
    }

    public void startMoving() {
        System.out.println("Kamaz is driving slowly");
    }
}
