import java.util.ArrayList;

public class GroceryList {
  private ArrayList<String> groceryList = new ArrayList<String>();

  public void addItem(String item) {
    groceryList.add(item);
  }

  public void modifyItem(int position, String newItem) {
    String itemToModify = groceryList.get(position);

    System.out.println("Replacing " + itemToModify + " with " + newItem);

    groceryList.set(position, newItem);
  }

  public void removeItem(int position) {
    String itemToRemove = groceryList.get(position);

    System.out.println("Removing " + itemToRemove + " from your list.");

    groceryList.remove(position);
  }

  public void printList() {
    System.out.println("You have " + groceryList.size() + " items in your list:");

    for (int i = 0; i < groceryList.size(); i++) {
      String item = groceryList.get(i);

      System.out.println((i + 1) + ". " + item);
    }
  }
}
