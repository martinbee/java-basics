public class Car {
  private String name;
  private int cylinders;
  private boolean isFourWheelDrive;
  private boolean engine = true;
  private int wheels = 4;

  public Car(String name, int cylinders, boolean isFourWheelDrive) {
    this.name = name;
    this.cylinders = cylinders;
    this.isFourWheelDrive = isFourWheelDrive;
  }

  public void startEngine() {
    System.out.println("Car engine started.");
  }

  public void accelerate() {
    System.out.println("Car is accelerating.");
  }

  public void brake() {
    System.out.println("Car is braking.");
  }

  public boolean getIsFourWheelDrive() {
    return isFourWheelDrive;
  }

  public int getCylinders() {
    return cylinders;
  }
  public String getName() {
    return name;
  }
}
