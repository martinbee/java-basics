import java.util.Scanner;

public class Main {
  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("Please enter how many numbers you'd like your array to be.");
    int arraySize = scanner.nextInt();
    System.out.println(arraySize);

    //int[] unsortedArray = getIntegers(arraySize);

    //printArray(unsortedArray);
  }

  public static void printArray(int[] array) {
    for(int number : array) {
      System.out.println(number);
    }
  }

  //public static int[] getIntegers(int number) {
    //System.out.println("");

  //}

  //public static int[] sortIntegers(int[] unsortedArray) {

  //}
}
