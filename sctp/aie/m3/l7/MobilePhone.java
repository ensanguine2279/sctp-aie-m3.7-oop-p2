package sctp.aie.m3.l7;

public class MobilePhone implements Trackable {
    private String model;

    public MobilePhone(String model) {
        this.model = model;
    }

    @Override
    public void track() {
        System.out.println("Tracking mobile phone " + this.model + ".");
    }

    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone("iPhone 14");
        phone.track();
        phone.startTracking(); // uses default method from Trackable interface
    }
}
