import java.util.Scanner;

public class Main {
  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int arraySize = getArraySize();
    int[] unsortedArray = getIntegers(arraySize);

    printArray(unsortedArray);
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

  //public static int[] sortIntegers(int[] unsortedArray) {

  //}
}
