package sctp.aie.m3.l7;

import java.util.ArrayList;

public class RetailCustomer extends Customer {
    private int accountNumber;
    private String membershipTier;
    private ArrayList<Double> purchases;

    public RetailCustomer(int accountNumber, String membershipTier) {
        // Note: We will improve this constructor later to accept name and joinYear
        // and pass them to the Customer constructor using super(name, joinYear).
        this.accountNumber = accountNumber;
        this.membershipTier = membershipTier;
        this.purchases = new ArrayList<Double>();
    }

    // add getters and setters

    // Note: We do not have a setPurchases() method here.
    // purchases is an ArrayList and we do not want to replace the entire list.
    // Instead, we use addPurchase() to add one purchase at a time.
    // This gives us better control over the data.

    // add methods specific to RetailCustomer
    public void addPurchase(double amount) {
        this.purchases.add(amount);
    }

    public double getAveragePurchase() {
        if (this.purchases.size() == 0) {
            System.out.println("No purchases recorded.");
            return 0;
        }
        double sum = 0;
        for (double amount : this.purchases) {
            sum += amount;
        }
        return sum / this.purchases.size();
    }

    @Override
    public void calculateDiscount() {
        System.out.println(this.getName() + " gets a 5% retail discount.");
    }
}