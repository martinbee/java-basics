public class Addition {
  private String name = "Nothing added";
  private double price = 0;

  public void setNameAndPrice(String name, double price) {
    this.name = name;
    this.price = price;
  }

  public double getPrice() {
    return price;
  }

  public String getName() {
    return name;
  }
}
