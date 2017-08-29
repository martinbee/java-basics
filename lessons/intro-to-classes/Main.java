public class Main {
  public static void main(String[] args) {
    // Test 1
    BankAccount account1 = new BankAccount();

    account1.setAccountNumber(123456);
    account1.setBalance(1000.00);
    account1.setCustomerName("Dan Mcguffin");
    account1.setEmail("thisIsReal@gmail.com");
    account1.setPhoneNumber("888-888-8888");

    double balance = account1.getBalance();
    String customerName = account1.getCustomerName();

    System.out.println(customerName + " has a balance of $" + balance);
    account1.depositFunds(500.00);
    account1.withdrawFunds(1000.00);
    account1.withdrawFunds(1000.00);
  }
}
