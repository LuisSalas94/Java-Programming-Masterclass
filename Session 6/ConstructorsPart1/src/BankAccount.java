public class BankAccount {
    private double balance;
    private String customerName, email, phoneNumber,accountNumber;

    public BankAccount(){
        //By Default
        this("56789", 2.50, "Default name", "Default address", "default phone");
        System.out.println("Empty constructor called");
    }

    //Constructor
    public BankAccount(String customerName, String email, String phoneNumber) {
        this("9999",100.55, customerName, email, phoneNumber);
    }

    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber){
       System.out.println("Account constructor with parameters called!");
       this.accountNumber = accountNumber;
       this.customerName = customerName;
       this.email = email;
       this.phoneNumber = phoneNumber;
       this.balance = balance;
    }

    //Getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public String getCustomerName(){
        return  customerName;
    }

    public String getEmail(){
        return email;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    //Setters
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New Balance is " + this.balance);
    }

    public void withdrawal(double withdrawalAmount){
        if(this.balance - withdrawalAmount < 0){
          System.out.println("Only " + this.balance + " available. Withdrawal not processed" );
        }else{
          this.balance -= withdrawalAmount;
          System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance = " + this.balance);
        }
    }


}
