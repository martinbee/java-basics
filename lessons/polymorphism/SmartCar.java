public class SmartCar extends Car {
  public SmartCar() {
    super("Smart Car", 4, false);
  }

  @Override
  public void accelerate() {
    System.out.println("Smart Car is attempting to accelerate.");
  }
}
