import java.util.ArrayList;

public class Bank {
  private String name;
  private ArrayList<Branch> branches = new ArrayList<Branch>();

  public Bank(String name) {
    this.name = name;
  }

  private int getBranchPosition(String branchName) {
    for (Branch branch : branches) {
      if (branch.getName().equals(branchName)) return branches.indexOf(branch);
    }

    return -1;
  }

  private boolean doesBranchAlreadyExist(String branchName) {
    return getBranchPosition(branchName) > -1;
  }

  private Branch getBranch(int position) {
    return branches.get(position);
  }

  public boolean addNewBranch(String branchName) {
    if (doesBranchAlreadyExist(branchName)) {
      System.out.println("A branch with name " + branchName + " already exists.");

      return false;
    }

    branches.add(new Branch(branchName));
    System.out.println("Created branch with name " + branchName);

    return true;
  }

  public boolean addNewCustomerToBranch(String branchName, String customerName, double transaction) {
    if (!doesBranchAlreadyExist(branchName)) {
      System.out.println("Could not find a branch with name " + branchName);
      return false;
    }

    int branchPosition = getBranchPosition(branchName);
    Branch branch = getBranch(branchPosition);
    branch.addCustomer(customerName, transaction);

    return true;
  }

  public boolean addTransaction(String branchName, String customerName, double transaction) {
    if (!doesBranchAlreadyExist(branchName)) {
      System.out.println("Could not find a branch with name " + branchName);
      return false;
    }

    int branchPosition = getBranchPosition(branchName);
    Branch branch = getBranch(branchPosition);
    branch.addTransaction(customerName, transaction);

    return true;
  }

  public void printCustomerList(String branchName, boolean showTransactions) {
    if (!doesBranchAlreadyExist(branchName)) {
      System.out.println("Could not find a branch with name " + branchName);
    } else {
      int branchPosition = getBranchPosition(branchName);
      Branch branch = getBranch(branchPosition);
      branch.printCustomerList(showTransactions);
    }
  }

  public void printBranchList() {
    System.out.println("Bank " + name + " has branches:");

    for (Branch branch : branches) {
      System.out.println("Branch: " + branch.getName());
    }
  }
}
