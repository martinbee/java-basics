public class Subaru extends Car {
  private Boolean fourWheelDrive;
  private String color;

  public Subaru(Boolean fourWheelDrive, String color) {
    super(12, 5, "SUV", 3);
    this.fourWheelDrive = fourWheelDrive;
    this.color = color;
  }

  public void beRugged() {
    System.out.println("Subaru is rugged");
  }

  @Override
  public void move() {
    System.out.println("Subaru is moving");
    super.move();
  }

  public void setFourWheelDrive(Boolean fourWheelDrive) {
    this.fourWheelDrive = fourWheelDrive;
  }

  public Boolean getFourWheelDrive() {
    return this.fourWheelDrive;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getColor() {
    return this.color;
  }
}
