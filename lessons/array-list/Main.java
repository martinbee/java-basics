public class Main {
  public static void main(String[] args) {
    GroceryList myGroceryList = new GroceryList();

    myGroceryList.addItem("Carrots");
    myGroceryList.addItem("Bread");
    myGroceryList.addItem("Milk");
    myGroceryList.printList();

    myGroceryList.removeItem(0);
    myGroceryList.printList();

    myGroceryList.modifyItem(0, "Candy");
    myGroceryList.printList();

    System.out.println(myGroceryList.findItem("Candy"));
    System.out.println(myGroceryList.findItem("Test"));
  }
}
