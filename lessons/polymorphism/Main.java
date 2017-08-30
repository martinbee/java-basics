public class Main {
  public static void main(String[] args) {
    Porsche porsche = new Porsche();
    Subaru subaru = new Subaru();
    Infinity infinity = new Infinity();
    SmartCar smartCar = new SmartCar();

    porsche.accelerate();
    porsche.brake();
    porsche.startEngine();

    subaru.accelerate();
    subaru.brake();
    subaru.startEngine();

    infinity.accelerate();
    infinity.brake();
    infinity.startEngine();

    smartCar.accelerate();
    smartCar.brake();
    smartCar.startEngine();
  }
}

// We are going to go back to the car analogy.
// Create a base class called Car
// It should have a few fields that would be appropriate for a generice car calss.
// engine, cylinders, wheels, etc.
// Constructor should initialize cylinders (number of) and name, and set wheels to 4
// and engine to true. Cylinders and names would be passed parameters.
//
// Create appropriate getters
//
// Create some methods like startEngine, accelerate, and brake
//
// show a message for each in the base class
// Now create 3 sub classes for your favorite vehicles.
// Override the appropriate methods to demonstrate polymorphism in use.
