public class BankAccount {
  private long accountNumber;
  private double balance;
  private String customerName;
  private String email;
  private String phoneNumber;

  // Additional Methods
  public double depositFunds(double amount) {
    this.balance += amount;

    System.out.println(
      "Depositing $" + amount + "; new balance is $" + this.balance
    );

    return this.balance;
  }

  public double withdrawFunds(double amount) {
    Boolean isBalanceLargeEnoughToWithdraw = (this.balance - amount) > 0;

    System.out.println("Attempting to withdraw $" + amount);

    if (isBalanceLargeEnoughToWithdraw) {

      this.balance -= amount;

      System.out.println(
        "Successfully withdrew $" + amount +
        "; new balance is $" + this.balance
      );

      return this.balance;
    }

    System.out.println("Insufficient Funds.");

    return -1;
  }

  // Setters
  public void setAccountNumber(long accountNumber) {
    this.accountNumber = accountNumber;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  // Getters
  public long getAccountNumber() {
    return this.accountNumber;
  }

  public double getBalance() {
    return this.balance;
  }

  public String getCustomerName() {
    return this.customerName;
  }

  public String getEmail() {
    return this.email;
  }

  public String getPhoneNumber() {
    return this.phoneNumber;
  }
}
