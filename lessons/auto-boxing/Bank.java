import java.util.ArrayList;

public class Bank {
  private ArrayList<Branch> branches = new ArrayList<Branch>();

  public boolean addNewBranch(String branchName) {
    // Add a new branch
    //
    // check if branch exists already
    // if not:
    branches.add(new Branch(branchName));
  }

  public boolean addNewCustomerToBranch(String branchName, String customerName, double transaction) {
    // Add a customer to that branch with initial transaction
    //
    // find branch using method on bank
    // call method on found branch class to add new customer
  }

  public boolean addTransaction(String branchName, String customerName, double transaction) {
    // find branch using bank method
    // use branch method to add customer/transaction
    // branch
    // find branch then pass customer name and transaction to method on branch

  }

  public void printCustomerList(String branchName, boolean showTransactions) {
    // find branch using bank method
    // call branch method to print, pass showTransactions(boolean)
    //
    // Show a list of customers for a particular branch and optionally a list
    // of their transactions
    System.out.println("Print c list");

    if (transactions) System.out.println("Print t list");
  }
}

// arraylist of branches

// Bank:
// Add a new branch
// Add a customer to that branch with initial transaction
// Add a transaction for an existing customer for that branch
// Show a list of customers for a particular branch and optionally a list
// of their transactions
//
// Demonstration autoboxing and unboxing in your code
// Hint: Transactions
//
// Add data validation.
// e.g. check if exists, or does not exist, etc.
