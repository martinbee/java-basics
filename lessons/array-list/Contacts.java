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

  private void printOptions() {
    System.out.println("\nSelect an option from the list below:");
    System.out.println("1: add new contact.");
    System.out.println("2: update existing contact.");
    System.out.println("3: remove contact.");
    System.out.println("4: find contact info.");
    System.out.println("5: list all contacts.");
    System.out.println("6: quit contact app.\n");
  }

  private int getUserOptionSelection() {
    return scanner.nextInt();
  }

  private String getUserTextInput() {
    return scanner.next();
  }

  private int findContactByName(String name) {
    for (Contact contact : myContacts) {
      boolean namesMatch = contact.getName().equals(name);

      if (namesMatch) return 1;
    }

    return -1;
  }

  private int findContact(Contact newContact) {
    return this.myContacts.indexOf(newContact);
  }

  private boolean doesContactAlreadyExist(Contact newContact) {
    boolean notInContactList = findContactByName(newContact.getName()) == -1;

    if (notInContactList) return false;

    return true;
  }

  private void addContact(Contact newContact) {
    myContacts.add(newContact);

    System.out.println(
      "Adding " + newContact.getName() + " with number " +
      newContact.getNumber() + " in your contacts."
    );
  }

  private void handleSelection() {
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

  private void handleAddNewContact() {
    System.out.println("Enter new contact name:");
    String name = getUserTextInput();

    System.out.println("Enter new contact number:");
    String number = getUserTextInput();

    Contact newContact = new Contact(name, number);

    if (doesContactAlreadyExist(newContact)) {
      System.out.println("A contact with name " + name + " already exists");
    } else {
      addContact(newContact);
    }
  }

  private void handleUpdateContact() {
    System.out.println("Enter the name of the contact that you wish to update:");
    String contactToUpdate = getUserTextInput();

    // find contact
    // if no contact error
    // ask if name or number needs to be updated
    // ask for new value and update
    System.out.println("Updating " + contactToUpdate);
  }

  private void handleRemoveContact() {
    // broken
    System.out.println("Enter the name of the contact that you wish to remove:");
    String contactToRemove = getUserTextInput();

    System.out.println("Removing " + contactToRemove);

    int positionToRemove = findContactByName(contactToRemove);
    System.out.println(positionToRemove);
    myContacts.remove(positionToRemove);
  }

  private Contact handleFindContact() {
    System.out.println("Enter the name of the contact that you wish to find:");
    String contactToFind = getUserTextInput();

    System.out.println("Finding " + contactToFind);

    int contactPosition = findContactByName(contactToFind);

    if (contactPosition == -1) {
      System.out.println("Could not find contact with name " + contactToFind);
      return null;
    }

    Contact foundContact = myContacts.get(contactPosition);

    System.out.println("Name: " + foundContact.getName() + ", Number: " + foundContact.getNumber());

    return foundContact;
  }

  private void handleListAllContacts() {
    if (myContacts.size() == 0) {
      System.out.println("You have not added any contacts.\n");
    } else {
      System.out.println("Your contacts:");

      for (Contact contact : myContacts) {
        System.out.println("Name: " + contact.getName() + ", Number: " + contact.getNumber());
      }
    }
  }

  private void handleQuitting() {
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
