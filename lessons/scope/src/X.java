import java.util.Scanner;

public class X {
  private int x;

  /**
  * @param x
  */
  public X(Scanner x) {
    this.x = x.nextInt();
  }

  public void timesTable() {
    for (int x = 1; x < 13; x++) {
      System.out.println(x * this.x);
    }
  }
}
