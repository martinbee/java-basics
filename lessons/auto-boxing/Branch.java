import java.util.ArrayList;

public class Branch {
  private String name;
  private ArrayList<Customer> customers = new ArrayList<Customer>();

  public Branch(String name) {
    this.name = name;
  }

  private int getCustomerPosition(String customerName) {
    for (Customer customer : customers) {
      if (customer.getName().equals(customerName)) return customers.indexOf(customer);
    }

    return -1;
  }

  private boolean isCustomerMemberOfBranch(String customerName) {
    return getCustomerPosition(customerName) > -1;
  }

  private Customer getCustomer(int position) {
    return customers.get(position);
  }

  public boolean addCustomer(String customerName, double initialTransaction) {
    if (isCustomerMemberOfBranch(customerName)) {
      System.out.println("Customer " + customerName + " is already a member of " + name + ".");

      return false;
    }

    Customer newCustomer = new Customer(customerName, initialTransaction);
    customers.add(newCustomer);
    return true;
  }

  public void addTransaction(String customerName, double transaction) {
    if (!isCustomerMemberOfBranch(customerName)) {
      System.out.println("Customer " + customerName + " is not a member of " + name + ".");
    } else {
      int customerPosition = getCustomerPosition(customerName);
      Customer customer = getCustomer(customerPosition);
      customer.addTransaction(transaction);

      System.out.println("Added a transaction of " + transaction + " to " + customer.getName());
    }
  }

  public void printCustomerList(boolean showTransactions) {
    System.out.println("Branch " + name + " has customers:");

    for (Customer customer : customers) {
      System.out.println("Name: " + customer.getName());

      if (showTransactions) customer.printTransactions();
    }
  }

  public String getName() {
    return name;
  }
}
