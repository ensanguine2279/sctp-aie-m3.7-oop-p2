package sctp.aie.m3.l7;

public class Customer {

    // FIELDS
    private String name;
    private int joinYear;

    // CONSTRUCTORS
    public Customer() {
    }

    public Customer(String name, int joinYear) {
        this.name = name;
        if (validateJoinYear(joinYear)) {
            this.joinYear = joinYear;
        }
    }

    // INSTANCE METHODS
    public void displayProfile() {
        if (this.joinYear == 0) {
            System.out.println("Customer: " + this.name + " (join year not set).");
            return;
        }
        int currentYear = java.time.Year.now().getValue();
        System.out.println("Customer: " + this.name + ", " + (currentYear - this.joinYear)
                + " years with us. Type: " + this.getClass().getSimpleName() + ".");
    }

    public void calculateDiscount() {
        System.out.println(this.name + " gets the standard discount.");
    }

    // VALIDATION
    private boolean validateJoinYear(int joinYear) {
        if (joinYear < 1990 || joinYear > java.time.Year.now().getValue()) {
            System.out.println("Invalid join year.");
            return false;
        }
        return true;
    }

    // GETTERS AND SETTERS
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJoinYear() {
        return this.joinYear;
    }

    public void setJoinYear(int joinYear) {
        if (validateJoinYear(joinYear)) {
            this.joinYear = joinYear;
        }
    }
}