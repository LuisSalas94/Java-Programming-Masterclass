public class VipCustomer {
    private String customerName;
    private double customerCreditLimit;
    private String customerEmailAddress;

    public VipCustomer(){
        this("Default name",100.00, "default@gmail.com");
    }

    public VipCustomer(String customerName, double customerCreditLimit, String customerEmailAddress) {
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerCreditLimit = customerCreditLimit;
    }

    public VipCustomer(String customerName, double customerCreditLimit) {
        this(customerName, customerCreditLimit, "unknown@gmail.com");
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public double getCustomerCreditLimit() {
        return customerCreditLimit;
    }
}
