public class Window {
  private Dimensions dimensions;
  private boolean isOpen;
  private String windowStyle;

  public Window(Dimensions dimensions, boolean isOpen, String windowStyle) {
    this.dimensions = dimensions;
    this.isOpen = isOpen;
    this.windowStyle = windowStyle;
  }

  public void closeBlinds() {
    System.out.println("The window's blinds have been closed!");
    this.isOpen = false;
  }

  public void openBlinds() {
    System.out.println("The window's blinds have been opened!");
    this.isOpen = true;
  }

  public Dimensions getDimensions() {
    return dimensions;
  }

  public boolean getIsOpen() {
    return isOpen;
  }

  public String getWindowStyle() {
    return windowStyle;
  }
}
