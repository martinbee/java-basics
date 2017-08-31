import java.util.Scanner;

// don't use Arrays methods

public class Main {
  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int arraySize = getArraySize();

    int[] unsortedArray = getIntegers(arraySize);
    System.out.println("Printing unsortedArray:");
    printArray(unsortedArray);

    int[] sortedArray = sortIntegers(unsortedArray);
    System.out.println("Printing sortedArray:");
    printArray(sortedArray);
  }

  public static int getArraySize() {
    System.out.println("Please enter how many numbers you'd like your array to be.\r");

    return scanner.nextInt();
  }

  public static int[] getIntegers(int arraySize) {
    System.out.println("Please enter " + arraySize + " integers to fill your array.\r");

    int[] integers = new int[arraySize];

    for (int i = 0; i < arraySize; i++) {
      integers[i] = scanner.nextInt();
    }

    return integers;
  }

  public static void printArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      int arrayItem = array[i];

      System.out.println("At index " + i + " int " + arrayItem);
    }
  }

  public static int[] sortIntegers(int[] unsortedArray) {
    // Don't want to mutate original array and for challenge can't use Arrays
    // methods
    int[] unsortedArrayCopy = new int[unsortedArray.length];
    int[] sortedArray = new int[unsortedArray.length];

    for (int i = 0; i < unsortedArray.length; i++) {
      unsortedArrayCopy[i] = unsortedArray[i];
    }

    for (int i = 0; i < unsortedArrayCopy.length; i++) {
      int currentIndex = i;
      int nextIndex = i + 1;
      int highestNumberYet = unsortedArrayCopy[i];
      int highestNumberYetIndex = i;

      for (int index = 0; index < unsortedArrayCopy.length; index++) {
        int comparisonNumber = unsortedArrayCopy[index];

        if (highestNumberYet < comparisonNumber) {
          highestNumberYet = comparisonNumber;
          highestNumberYetIndex = index;
        }
      }

      sortedArray[i] = highestNumberYet;
      unsortedArrayCopy[highestNumberYetIndex] = 0;
    }

    return sortedArray;
  }
}
