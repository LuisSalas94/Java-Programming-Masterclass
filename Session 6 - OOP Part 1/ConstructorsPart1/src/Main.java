public class Main {
    public static void main(String[] args) {
        //BankAccount bankAccount = new BankAccount("12345", 0.00, "Fernando Salas", "fernando@gmail.com", "(051)123-4567");
        BankAccount bankAccount = new BankAccount();
        System.out.println(bankAccount.getBalance());
        System.out.println(bankAccount.getAccountNumber());
        bankAccount.withdrawal(100.0);

        bankAccount.deposit(50.0);
        bankAccount.withdrawal(100.0);

        bankAccount.deposit(51.0);
        bankAccount.withdrawal(100.0);
        BankAccount fernandoAccount = new BankAccount("Fernando","fernando@gmail.com","12345");
        System.out.println(fernandoAccount.getAccountNumber() + " name " + fernandoAccount.getCustomerName());

        System.out.println("**************************************************************************");
        VipCustomer customer = new VipCustomer();
        System.out.println(customer.getCustomerName());

        VipCustomer customer2 = new VipCustomer("Fernando", 2500.00);
        System.out.println(customer2.getCustomerName());

        VipCustomer customer3 = new VipCustomer("Fernando", 100.00, "fernando@gmail.com");
        System.out.println(customer3.getCustomerName());

    }
}