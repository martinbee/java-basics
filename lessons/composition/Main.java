public class Main {
  public static void main(String[] args) {
    Dimensions doorDimensions = new Dimensions(7, 3);
    Door door = new Door(doorDimensions, true, "wood");

    Dimensions windowDimensions = new Dimensions(3, 3);
    Window window = new Window(windowDimensions, true, "french");

    Dimensions roomDimensions = new Dimensions(9, 10);
    Room myRoom = new Room(door, window, roomDimensions);

    myRoom.getWindow().closeBlinds();
    myRoom.getWindow().openBlinds();

    myRoom.secureRoom();
    myRoom.openRoom();
  }
}
