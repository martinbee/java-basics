import java.util.ArrayList;

public class Customer {
  private String name;
  private ArrayList<Double> transactions = new ArrayList<Double>();

  public Customer(String name, double initialTransaction) {
    this.name = name;
    this.transactions.add(initialTransaction);
  }

  public void addTransaction(double transaction) {
    this.transactions.add(transaction);
  }

  public void printTransactions() {
    System.out.println(this.name + "'s transactions:");

    for (double transaction : transactions) {
      System.out.println(transaction);
    }
  }

  public String getName() {
    return name;
  }
}
