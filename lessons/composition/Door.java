public class Door {
  private Dimensions dimensions;
  private boolean isOpen;
  private String doorType;

  public Door(Dimensions dimensions, boolean isOpen, String doorType) {
    this.dimensions = dimensions;
    this.isOpen = isOpen;
    this.doorType = doorType;
  }

  public void closeDoor() {
    System.out.println("The door has been closed!");
    this.isOpen = false;
  }

  public void openDoor() {
    System.out.println("The door has been opened!");
    this.isOpen = true;
  }

  public Dimensions getDimensions() {
    return dimensions;
  }

  public boolean getIsOpen() {
    return isOpen;
  }

  public String getDoorType() {
    return doorType;
  }
}
