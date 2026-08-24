package sctp.aie.m3.l7;

public abstract class Vehicle implements Drivable, Trackable {
    private String make;

    public Vehicle(String make) {
        this.make = make;
    }

    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }
}
