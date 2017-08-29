public class Vehicle {
  private int speed;
  private int numberOfPassengers;

  public Vehicle(int speed, int numberOfPassengers) {
    this.speed = speed;
    this.numberOfPassengers = numberOfPassengers;
  }

  public void move() {
    System.out.println("Vehicle is moving at a speed of " + this.speed);
  }

  public int getSpeed() {
    return this.speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public int getNumberOfPassengers() {
    return this.numberOfPassengers;
  }

  public void setNumberOfPassengers(int numberOfPassengers) {
    this.numberOfPassengers = numberOfPassengers;
  }
}
