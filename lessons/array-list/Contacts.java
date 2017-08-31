import java.util.Scanner;
import java.util.ArrayList;

public class Contacts {
  private Scanner scanner = new Scanner(System.in);
  private boolean running = false;
  private ArrayList<Contact> myContacts = new ArrayList<Contact>();

  public void run() {
    running = true;

    while (running) {
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

  public String getUserTextInput() {
    return scanner.next();
  }

  public void handleSelection() {
    int userSelection = getUserOptionSelection();

    switch (userSelection) {
      case 1:
        handleAddNewContact();
        break;
      case 2:
        handleUpdateContact();
        break;
      case 3:
        handleRemoveContact();
        break;
      case 4:
        handleFindContact();
        break;
      case 5:
        handleListAllContacts();
        break;
      case 6:
        handleQuitting();
        break;
      default:
        System.out.println("Option not recognized. It's not us, it's you.\n");
        break;
    }
  }

  public void handleAddNewContact() {
    System.out.println("Enter new contact name:");
    String name = getUserTextInput();

    System.out.println("Enter new contact number:");
    String number = getUserTextInput();

    // make new contact then add to list if not already in list
    System.out.println("Adding " + name + " with number " + number + " to contacts.");
  }

  public void handleUpdateContact() {
    System.out.println("Enter the name of the contact that you wish to update:");
    String contactToUpdate = getUserTextInput();

    // find contact
    // if no contact error
    // ask if name or number needs to be updated
    // ask for new value and update
    System.out.println("Updating " + contactToUpdate);
  }

  public void handleRemoveContact() {
    System.out.println("Enter the name of the contact that you wish to remove:");
    String contactToRemove = getUserTextInput();

    System.out.println("Removing " + contactToRemove);
    // remove contact with that name
  }

  public void handleFindContact() {
    System.out.println("Enter the name of the contact that you wish to find:");
    String contactToFind = getUserTextInput();

    System.out.println("Finding " + contactToFind);
    // display name and number
  }

  public void handleListAllContacts() {
    if (myContacts.size() == 0) {
      System.out.println("You have not added any contacts.");
    } else {
      System.out.println("Your contacts:");

      for (Contact contact : myContacts) {
        System.out.println("Name: " + contact.getName() + ", Number: " + contact.getNumber());
      }
    }
  }

  public void handleQuitting() {
    System.out.println("Shutting down contacts app...");
    running = false;
  }
}

// Create a program that implements a simple mobile phone with the following capabilities.
// Able to store, modify, remove and query contact names.
// You will want to create a separate class for Contacts (name and phone number).
// Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
// and search/find contact.
// When adding or updating be sure to check if the contact already exists (use name)
// Be sure not to expose the inner workings of the Arraylist to MobilePhone
// e.g. no ints, no .get(i) etc
// MobilePhone should do everything with Contact objects only.
