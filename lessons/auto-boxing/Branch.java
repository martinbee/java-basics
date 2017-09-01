import java.util.ArrayList;

public class Branch {
  private String name;
  private ArrayList<Customer> customers = new ArrayList<Customer>();

  public Branch(String name) {
    this.name = name;
  }

  public boolean addCustomer(String customerName, double initialTransaction) {
    // check if customer with name already exists
    // if not
    Customer newCustomer = new Customer(customerName, initialTransaction);
    customers.add(newCustomer);
  }

  public int findCustomerPosition(String customerName) {
    for (Customer customer : customers) {
      if (customer.getName().equals(customerName)) return customers.indexOf(customer);
    }

    return -1;
  }

  public boolean isCustomerMemberOfBranch(String customerName) {
    return findCustomerPosition(customerName) > -1;
  }

  public addTransaction(String customerName, double transaction) {
    // find customer

    // customer.addTransaction(transaction);
  }

}

// arraylist of customers
//
// Branch:
// Need to be able to add a new customer and initial transaction amount.
// Also needs to add additional transactions for that customer/branch
//
// find customer in list
// call customer method to add transaction
