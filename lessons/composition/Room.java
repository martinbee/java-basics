public class Room {
  private Door door;
  private Window window;
  private Dimensions dimensions;

  public Room(Door door, Window window, Dimensions dimensions) {
    this.door = door;
    this.window = window;
    this.dimensions = dimensions;
  }
}
