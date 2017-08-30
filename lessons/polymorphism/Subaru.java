public class Subaru extends Car {
  public Subaru() {
    super("Subaru", 6, true);
  }

  @Override
  public void brake() {
    System.out.println("Subaru is braking!");
  }

  @Override
  public void startEngine() {
    System.out.println("Subaru engine rumbled to life!");
  }
}

