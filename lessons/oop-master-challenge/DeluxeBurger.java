public class DeluxeBurger extends Burger {
  private Addition[] additions = {
    new Addition("chips", 1.50),
    new Addition("soda", 1.00)
  };

  public DeluxeBurger(String rollType, String meat, String name, double price) {
    super(rollType, meat, name, price);
  }

  @Override
  public void addAddition(String name, double price, int additionNumber) {
    System.out.println("Deluxe burger comes with chips and soda, that's it!");
  }

  public void getBalance() {
    System.out.println("Getting your deluxe burger balance!");
    super.getBalance(additions);
  }
}
