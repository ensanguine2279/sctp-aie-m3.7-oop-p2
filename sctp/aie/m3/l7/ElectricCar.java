package sctp.aie.m3.l7;

public class ElectricCar extends Vehicle implements BatteryPack {
    private double batteryLevel;

    public ElectricCar(String make, double batteryLevel) {
        super(make);
        this.batteryLevel = batteryLevel;
    }

    public ElectricCar(String make) {
        this(make, 0);
    }

    @Override
    public void track() {
        System.out.println("Tracking electric car " + this.getMake() + ".");
    }

    public void drive() {
        if (this.batteryLevel > 0) {
            System.out.println("Driving the electric car...");
            this.batteryLevel -= 10; // Assume driving consumes 10 units of battery
        } else {
            System.out.println("Cannot drive. Battery is empty.");
        }
    }

    public void stop() {
        System.out.println("Electric car stopped.");
    }

    @Override
    public void charge() {
        this.batteryLevel = 100.0; // Assume full battery is 100 units
        System.out.println("Battery charged to " + this.batteryLevel + " units.");
    }

    @Override
    public double getCharge() {
        return this.batteryLevel;
    }

    public static void main(String[] args) {
        ElectricCar myElectricCar = new ElectricCar("Tesla", 77);
        myElectricCar.track();
        myElectricCar.drive();
        myElectricCar.stop();
        myElectricCar.charge();
        System.out.println("Remaining battery level: " + myElectricCar.getCharge() + " units.");
    }

}
