import java.util.Scanner;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
  private static LinkedList<String> citiesToVisit = new LinkedList<String>();

  public static void main(String[] args) {
    addInOrder("Saigon");
    addInOrder("Singapore");
    addInOrder("Beijing");
    addInOrder("Hong Kong");
    addInOrder("Zanzibar");
    printList();

    visit();
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

  private static void visit() {
    Scanner scanner = new Scanner(System.in);
    boolean quit = false;

    ListIterator<String> iterator = citiesToVisit.listIterator();

    if (citiesToVisit.isEmpty()) {
      System.out.println("No cities to visit. Please add some cities.");

      return;
    } else {
      System.out.println("Now visiting " + iterator.next());
      printMenu();
    }

    while (!quit) {
      int action = scanner.nextInt();
      scanner.nextLine();

      switch (action) {
        case 0:
          System.out.println("Vacation over.");
          quit = true;
          break;
        case 1:
          if (iterator.hasNext()) {
            System.out.println("Now visiting " + iterator.next());
          } else {
            System.out.println("Reached end of list!");
          }

          break;
        case 2:
          if (iterator.hasPrevious()) {
            System.out.println("Now visiting " + iterator.previous());
          } else {
            System.out.println("Reached beginning of list!");
          }
          break;
        default:
          printMenu();
          break;
      }
    }
  }

  private static void printMenu() {
    System.out.println("Available actions: \npress ");
    System.out.println("1 - go to next city");
    System.out.println("2 - go to previous city");
    System.out.println("3 - see options again");
    System.out.println("0 - end vacation");
  }
}
