public class HealthyBurger extends Burger {
  private Addition[] additions = {
    new Addition(),
    new Addition(),
    new Addition(),
    new Addition(),
    new Addition(),
    new Addition()
  };

  public HealthyBurger(String meat, String name, double price) {
    super("brown rye", meat, name, price);
  }

  @Override
  public void addAddition(String name, double price, int additionNumber) {
    if (additionNumber > 6) {
      System.out.println("Whoa! You only get 6additions!");
    } else {
      System.out.println("Adding " + name + " to your burger for $" + price);
      this.additions[additionNumber - 1].setNameAndPrice(name, price);
    }
  }

  public void getBalance() {
    System.out.println("Getting your healthy burger balance!");
    super.getBalance(additions);
  }
}
