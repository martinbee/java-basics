import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
  private static LinkedList<String> citiesToVisit = new LinkedList<String>();

  public static void main(String[] args) {
    addInOrder("Saigon");
    printList();
    addInOrder("Singapore");
    addInOrder("Beijing");
    addInOrder("Hong Kong");
    addInOrder("Zanzibar");
    printList();
  }

  private static void printList() {
    Iterator<String> iterator = citiesToVisit.iterator();

    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }

  private static boolean addInOrder(String newCity) {
    ListIterator<String> listIterator = citiesToVisit.listIterator();

    while (listIterator.hasNext()) {
      int comparison = listIterator.next().compareTo(newCity);

      if (comparison == 0) {
        System.out.println("City already is in list");

        return false;
      }

      if (comparison > 0) {
        listIterator.previous();
        listIterator.add(newCity);

        return true;
      }
    }

    listIterator.add(newCity);

    return true;
  }
}
