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

      if (namesMatch) return myContacts.indexOf(contact);
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
    System.out.println("\nEnter the name of the contact that you wish to update:");
    String name = getUserTextInput();

    int contactToUpdatePosition = findContactByName(name);

    if (contactToUpdatePosition == -1) {
      System.out.println("No contact found matching name " + name);
    } else {
      System.out.println("Updated name:");
      String updatedName = getUserTextInput();

      System.out.println("Updated number:");
      String updatedNumber = getUserTextInput();

      System.out.println("Updating " + name);
      Contact updatedContact = new Contact(updatedName, updatedNumber);

      myContacts.set(contactToUpdatePosition, updatedContact);
    }
  }

  private void handleRemoveContact() {
    System.out.println("Enter the name of the contact that you wish to remove:");
    String contactToRemove = getUserTextInput();

    System.out.println("\nRemoving " + contactToRemove);

    int positionToRemove = findContactByName(contactToRemove);

    if (positionToRemove == -1) {
      System.out.println("No contact found with name: " + contactToRemove);
    } else {
      myContacts.remove(positionToRemove);
    }
  }

  private Contact handleFindContact() {
    System.out.println("Enter the name of the contact that you wish to find:");
    String contactToFind = getUserTextInput();

    System.out.println("\nFinding " + contactToFind);

    int contactPosition = findContactByName(contactToFind);

    if (contactPosition == -1) {
      System.out.println("Could not find contact with name: " + contactToFind);

      return null;
    }

    Contact foundContact = myContacts.get(contactPosition);

    System.out.println("Name: " + foundContact.getName() + ", Number: " + foundContact.getNumber());

    return foundContact;
  }

  private void handleListAllContacts() {
    if (myContacts.size() == 0) {
      System.out.println("\nYou have not added any contacts.");
    } else {
      System.out.println("\nYour contacts:");

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
