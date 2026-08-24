package sctp.aie.m3.l7;

public class CorporateCustomer extends Customer {
    private String companyName;
    private double contractValue;
    private String accountManager;

    public CorporateCustomer(String name, int joinYear, String companyName, double contractValue,
            String accountManager) {
        super(name, joinYear);
        this.companyName = companyName;
        this.contractValue = contractValue;
        this.accountManager = accountManager;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double getContractValue() {
        return contractValue;
    }

    public void setContractValue(double contractValue) {
        this.contractValue = contractValue;
    }

    public String getAccountManager() {
        return accountManager;
    }

    public void setAccountManager(String accountManager) {
        this.accountManager = accountManager;
    }

    @Override
    public void displayProfile() {
        super.displayProfile(); // Call the parent class method to display name and join year
        System.out.println("Company: " + this.companyName + ", Contract value: " + this.contractValue
                + ", account manager: " + this.accountManager + ".");
    }

    @Override
    public void calculateDiscount() {
        System.out.println(this.getName() + " gets a 15% retail discount.");
    }

    public static void main(String[] args) {
        CorporateCustomer corporate = new CorporateCustomer("John", 2010, "Acme Pte Ltd", 250000, "Sarah Lim");

        // Calling Parent class methods
        corporate.displayProfile();
        corporate.calculateDiscount();

        // Calling Child class methods
        System.out.println("Company: " + corporate.getCompanyName());
        System.out.println("Contract value: " + corporate.getContractValue());
    }

}
