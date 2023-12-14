abstract class Vehicle {
    protected String number;
    protected String model;
    protected String make;

    abstract void startMoving();

    void startEngie() {
        System.out.println("Engine RRRRRRRRRRRRRRRRRRR");
    }
}
