import java.util.Scanner;

public class MobilePhone {
  private Scanner scanner = new Scanner(System.in);
  private boolean contactAppRunning = false;

  public void openContactsApp() {
    System.out.println("Opening up the contacts app...\n");

    runContactsApp();
  }

  public void runContactsApp() {
    contactAppRunning = true;

    while (contactAppRunning) {
      printOptions();
      handleSelection();
    }
  }

  public void printOptions() {
    System.out.println("Select an option from the list below:");
    System.out.println("1: add new contact.");
    System.out.println("2: update existing contact.");
    System.out.println("3: remove contact.");
    System.out.println("4: find contact info.");
    System.out.println("5: list all contacts.");
    System.out.println("6: quit contact app.\n");
  }

  public int getUserOptionSelection() {
    return scanner.nextInt();
  }

  public void handleSelection() {
    int userSelection = getUserOptionSelection();

    switch (userSelection) {
      case 1:
        break;
      case 2:
        break;
      case 3:
        break;
      case 4:
        break;
      case 5:
        break;
      case 6:
        handleQuitting();
        break;
      default:
        System.out.println("Option not recognized. It's not us, it's you.\n");
        break;
    }
  }

  public void handleQuitting() {
    System.out.println("Shutting down contacts app...");
    contactAppRunning = false;
  }
}

// Create a program that implements a simple mobile phone with the following capabilities.
// Able to store, modify, remove and query contact names.
// You will want to create a separate class for Contacts (name and phone number).
// Create a master class (MobilePhone) that holds the ArrayList of Contacts
// The MobilePhone class has the functionality listed above.
// Add a menu of options that are available.
// Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
// and search/find contact.
// When adding or updating be sure to check if the contact already exists (use name)
// Be sure not to expose the inner workings of the Arraylist to MobilePhone
// e.g. no ints, no .get(i) etc
// MobilePhone should do everything with Contact objects only.
