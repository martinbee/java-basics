import java.util.ArrayList;

public class GroceryList {
  private ArrayList<String> groceryList = new ArrayList<String>();

  public void addItem(String item) {
    groceryList.add(item);
  }

  public void printList() {
    System.out.println("You have " + groceryList.size() + " items in your list:");

    for (int i = 0; i < groceryList.size(); i++) {
      String item = groceryList.get(i);

      System.out.println((i + 1) + ". " + item);
    }
  }
}
