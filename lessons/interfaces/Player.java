import java.util.List;
import java.util.ArrayList;

public class Player implements ISaveable {
  private String name = "Player One";
  private String weapon = "Rusty Sword";
  private int health = 5;
  private int level = 0;

  public Player(String name, int health, int level) {
    this.name = name;
    this.health = health;
    this.level = level;
  }

  public boolean setHealth(int health) {
    this.health = health;

    return true;
  }

  public boolean setWeapon(String weapon) {
    this.weapon = weapon;

    return true;
  }

  @Override
  public void read(List<Data> dataSource) {
    for (Data dataItem : dataSource) {
      String key = dataItem.getKey();

      switch (key) {
        case "name":
          this.name = dataItem.getValue();
          break;
        case "weapon":
          this.weapon = dataItem.getValue();
          break;
        case "health":
          this.health = Integer.parseInt(dataItem.getValue());
          break;
        case "level":
          this.level = Integer.parseInt(dataItem.getValue());
          break;
        default:
          System.out.println(key + " is not a valid field on Player.");
          break;
      }
    }
  }

  @Override
  public List<Data> write() {
    List<Data> dataToSave = new ArrayList<Data>();

    dataToSave.add(new Data("name", name));
    dataToSave.add(new Data("weapon", weapon));
    dataToSave.add(new Data("level", String.valueOf(level)));
    dataToSave.add(new Data("health", String.valueOf(health)));

    return dataToSave;
  }

  @Override
  public String toString() {
    return (
      "Player: {\n" +
      "  Name: " + name + ",\n" +
      "  Weapon: " + weapon + ",\n" +
      "  Level: " + level + ",\n" +
      "  Health: " + health + ",\n" +
      "};"
    );
  }
}
