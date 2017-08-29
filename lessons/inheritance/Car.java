public class Car extends Vehicle {
  private String carType;
  private int currentGear;

  public Car(int speed, int numberOfPassengers, String carType, int currentGear) {
    super(speed, numberOfPassengers);

    this.carType = carType;
    this.currentGear = currentGear;
  }

  public void steer() {
    System.out.println("The car is steering.");
  }

  public void increaseSpeed() {
    this.currentGear += 1;
    System.out.println("Shifting gears up!");

    super.setSpeed(super.getSpeed() + 1);
  }

  public void decreaseSpeed() {
    this.currentGear -= 1;
    System.out.println("Shifting gears down!");

    super.setSpeed(super.getSpeed() - 1);
  }

  @Override
  public void move() {
    System.out.println("Car is moving at a speed of " + super.getSpeed());
    super.move();
  }

  public String getCarType() {
    return this.carType;
  }

  public void setCarType(String carType) {
    this.carType = carType;
  }

  public int getCurrentGear() {
    return this.currentGear;
  }

  public void setCurrentGear(int currentGear) {
    this.currentGear = currentGear;
  }
}
