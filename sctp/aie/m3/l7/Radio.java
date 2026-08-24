package sctp.aie.m3.l7;

public class Radio {
    private String model;

    public Radio(String model) {
        this.model = model;
    }

    public void play() {
        System.out.println("Playing radio...");
    }

    public void stop() {
        System.out.println("Stopping radio...");
    }
}
