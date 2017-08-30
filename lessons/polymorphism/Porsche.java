public class Porsche extends Car {
  public Porsche() {
    super("Porsche", 6, false);
  }

  @Override
  public void accelerate() {
    System.out.println("Porsche is speeding away!");
  }

  @Override
  public void startEngine() {
    System.out.println("Porsche is revving up!");
  }
}
