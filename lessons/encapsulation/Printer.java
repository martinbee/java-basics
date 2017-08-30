public class Printer {
  int tonerLevel = 100;
  int numberOfPagesPrinted = 0;
  boolean isDuplex;

  public Printer(int tonerLevel, int numberOfPagesPrinted, boolean isDuplex) {
    boolean isTonerLevelValid = tonerLevel >= 0 && tonerLevel <= 100;

    if (isTonerLevelValid) this.tonerLevel = tonerLevel;
    if (numberOfPagesPrinted >= 0) this.numberOfPagesPrinted = numberOfPagesPrinted;

    this.isDuplex = isDuplex;
  }

  public void fillUpToner(int amount) {
    if (amount <= 0) {
      System.out.println("Good try!");
    } else {
      if (tonerLevel == 100) {
        System.out.println("Toner level is already full!");
      } else {
        int newTonerLevel = tonerLevel + amount;

        if (newTonerLevel >= 100) {
          System.out.println("You fill the toner level up to 100");

          this.tonerLevel = 100;
        } else {
          System.out.println("You fill the toner level up to " + newTonerLevel);

          this.tonerLevel = newTonerLevel;
        }
      }
    }
  }

  public void print(int numberOfPages) {
    int tonerCost = numberOfPages;
    int newTonerLevel = tonerLevel - tonerCost;

    if (newTonerLevel < 0) {
      System.out.println("Not enough toner, please fill up or print less pages.");
    } else {
      int pagesToPrint = isDuplex ? numberOfPages / 2 : numberOfPages;

      if (isDuplex) System.out.println("Printing in duplex mode.");

      System.out.println("Printing " + pagesToPrint + " pages.");
      System.out.println("Toner level is now " + newTonerLevel);

      this.tonerLevel = newTonerLevel;
      this.numberOfPagesPrinted += pagesToPrint;
    }
  }

  public int getTonerLevel() {
    return tonerLevel;
  }

  public int getNumberOfPagesPrinted() {
    return numberOfPagesPrinted;
  }
}
