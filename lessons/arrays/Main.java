import java.util.Scanner;
import java.util.Arrays;

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
    int[] sortedArray = Arrays.copyOf(unsortedArray, unsortedArray.length);

    boolean flag = true;
    int temp;

    while(flag) {
      flag = false;

      for (int i = 0; i < sortedArray.length - 1; i++) {
        if (sortedArray[i] < sortedArray[i + 1]) {
          temp = sortedArray[i];
          sortedArray[i] = sortedArray[i + 1];
          sortedArray[i + 1] = temp;
          flag = true;
        }
      }
    }

    return sortedArray;
  }
}
