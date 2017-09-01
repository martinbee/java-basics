public class Main {
  public static void main(String[] args) {
    Bank westernUnion = new Bank("Western Union");

    westernUnion.printBranchList();
    westernUnion.addNewBranch("Houston");
    westernUnion.printBranchList();
    westernUnion.addNewCustomerToBranch("Houston", "Hanna", 1.00);
    westernUnion.printCustomerList("Houston", false);
    westernUnion.printCustomerList("Houston", true);
    westernUnion.addTransaction("Houston", "Hanna", 140.00);
    westernUnion.printCustomerList("Houston", true);
  }
}
