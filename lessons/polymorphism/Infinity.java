public class Infinity extends Car {
  public Infinity() {
    super("Infinity", 6, false);
  }

  @Override
  public void accelerate() {
    System.out.println("Infinity is adult accelerating!");
  }
}
