public class Main {
  public static void main(String[] args) {
    Car exampleCar = new Car(10, 2, "SUV", 3);

    exampleCar.steer();
    System.out.println("Current speed: " + exampleCar.getSpeed());
    exampleCar.increaseSpeed();
    exampleCar.move();
  }
}
