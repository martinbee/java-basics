public class Burger {
  private String rollType;
  private String meat;
  private String name;
  private double price;
  private Addition[] additions = { new Addition(), new Addition(), new Addition(), new Addition() };

  public Burger(String rollType, String meat, String name, double price) {
    this.rollType = rollType;
    this.meat = meat;
    this.name = name;
    this.price = price;
  }

  public void addAddition(String name, double price, int additionNumber) {
    if (additionNumber > 4) {
      System.out.println("Whoa! You only get 4 additions!");
    } else {
      System.out.println("Adding " + name + " to your burger for $" + price);
      this.additions[additionNumber - 1].setNameAndPrice(name, price);
    }
  }

  public void getBalance(Addition[] additions) {
    System.out.println("Your burger has a base price of $" + this.price);

    double overallBalance = this.price;

    for (Addition addition : additions) {
      double additionPrice = addition.getPrice();
      String additionName = addition.getName();

      if (additionPrice > 0) {
        System.out.println("You added " + additionName + " for $" + additionPrice);

        overallBalance += additionPrice;
      }
    }

    System.out.println("Your burger has a total price of $" + overallBalance);
  }

  public Addition[] getAdditions() {
    return additions;
  }
}
