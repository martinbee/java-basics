public class X {
  private int x;

  /**
  * @param x
  */
  public X(int x) {
    this.x = x;
  }

  public void timesTable() {
    for (int x = 1; x < 13; x++) {
      System.out.println(x * this.x);
    }
  }
}
