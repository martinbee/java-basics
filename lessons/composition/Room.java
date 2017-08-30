public class Room {
  private Door door;
  private Window window;
  private Dimensions dimensions;

  public Room(Door door, Window window, Dimensions dimensions) {
    this.door = door;
    this.window = window;
    this.dimensions = dimensions;
  }

  public void secureRoom() {
    System.out.println("Securing room!");
    window.closeBlinds();
    door.closeDoor();
  }

  public void openRoom() {
    System.out.println("Opening room!");
    window.openBlinds();
    door.openDoor();
  }

  public Window getWindow() {
    return window;
  }
}
