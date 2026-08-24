package sctp.aie.m3.l7;

public interface Trackable {
    // public abstract void track();
    // public and abstract are not required
    void track();

    // Variables in interfaces are implicitly public, static and final (constants)
    int MAX_TRACKING_DISTANCE = 1000; // same as: public static final int MAX_TRACKING_DISTANCE = 1000;

    // Default method - has a body, implementing class can use as-is or override
    // (Java 8+)
    default void startTracking() {
        System.out.println("Tracking started. Max distance: " + MAX_TRACKING_DISTANCE + "km.");
    }
}
