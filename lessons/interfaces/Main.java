import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Player martin = new Player("Martin", 10, 2);

    System.out.println(martin.toString());

    saveObject(martin);

    martin.setHealth(8);

    System.out.println(martin.toString());

    martin.setWeapon("Stormbringer");

    System.out.println(martin.toString());

    saveObject(martin);
    loadObject(martin);

    System.out.println(martin);

    Monster kobold = new Monster("Kobold", "Neutral Evil", 2, 1);

    System.out.println(kobold);

    kobold.setDamage(2);

    kobold.attackPlayer(martin);

    System.out.println(martin);

    saveObject(kobold);
    loadObject(kobold);

    System.out.println(kobold);
  }

  public static List<Data> readValues() {
    List<Data> values = new ArrayList<Data>();
    Scanner scanner = new Scanner(System.in);

    boolean quit = false;

    printOptions();

    while (!quit) {
      System.out.print("Choose an option: ");

      int choice = scanner.nextInt();
      scanner.nextLine();

      switch (choice) {
        case 0:
          quit = true;
          break;
        case 1:
          System.out.print("Enter key for data item: ");
          String key = scanner.nextLine();

          System.out.print("Enter value for data item: ");
          String value = scanner.nextLine();

          values.add(new Data(key, value));
          break;
        default:
          printOptions();
          break;
      }
    }

    return values;
  }

  private static void printOptions() {
    System.out.println("Choose\n");
    System.out.println("1 to enter a data item");
    System.out.println("0 to quit");
  }

  public static void saveObject(ISaveable objectToSave) {
    List<Data> dataToSave = objectToSave.write();

    for (Data dataItem : dataToSave) {
      System.out.println("Saving " + dataItem.toString() + " to storage device");
    }
  }

  public static void loadObject(ISaveable objectToLoad) {
    List<Data> values = readValues();

    objectToLoad.read(values);
  }
}

// Create a simple interface that allows an object to be saved to some sort of storage medium.
// The exact type of medium is not known to the interface (nor to the classes that implement it).
// The interface will just specify 2 methods, one to return an ArrayList of values to be saved
// and the other to populate the object's fields from an ArrayList.
//
// Create some sample classes that implement your saveable interface (we've used the idea of a game,
// with Players and Monsters, but you can create any type of classes that you want).
//
// Override the toString() method for each of your classes so that they can be easily printed to enable
// the program to be tested easier.
//
// In Main, write a method that takes an object that implements the interface as a parameter and
// "saves" the values.
// We haven't covered I/O yet, so your method should just print the values to the screen.
// Also in Main, write a method that restores the values to a saveable object.
// Again, we are not going to use Java file I/O; instead use the readValues() method below to
// simulate getting values from a file – this allows you to type as many values as your class
// requires, and returns an ArrayList.
