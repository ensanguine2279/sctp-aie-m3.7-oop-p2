package sctp.aie.m3.l7;

public class Car extends Vehicle implements FuelTank {
    private double fuelLevel;
    private Radio radio;

    public Car(String make, double fuelLevel) {
        super(make);
        this.fuelLevel = fuelLevel;
        this.radio = new Radio("Sony");
    }

    public Car(String make) {
        this(make, 0);
    }

    @Override
    public void fill() {
        this.fuelLevel = 100.0; // Assume full tank is 100 units
        System.out.println("Fuel tank filled to " + this.fuelLevel + " units.");
    }

    @Override
    public double getFuelLevel() {
        return this.fuelLevel;
    }

    @Override
    public void track() {
        System.out.println("Tracking car " + this.getMake() + ".");
    }

    public void drive() {
        if (this.fuelLevel > 0) {
            System.out.println("Driving the car...");
            this.fuelLevel -= 10; // Assume driving consumes 10 units of fuel
        } else {
            System.out.println("Cannot drive. Fuel tank is empty.");
        }
    }

    public void stop() {
        System.out.println("Car stopped.");
    }

    public void playRadio() {
        this.radio.play();
    }

    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 77);
        myCar.track();
        myCar.drive();
        myCar.stop();
        myCar.fill();
        myCar.playRadio();
        System.out.println("Remaining fuel level: " + myCar.getFuelLevel() + " units.");
    }

}
