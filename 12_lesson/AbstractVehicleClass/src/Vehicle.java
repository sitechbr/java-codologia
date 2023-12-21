abstract class Vehicle {
    protected String number;
    protected String model;
    protected String make;

    void starEngine() {
        System.out.println("Engine RRRRRRRRR");
    }

    abstract void startMoving();

}
