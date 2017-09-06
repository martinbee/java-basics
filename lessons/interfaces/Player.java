import java.util.List;
import java.util.ArrayList;

public class Player implements ISaveable {
  private String name = "Player One";
  private String weapon = "Rusty Sword";
  private int health = 5;
  private int level = 0;
  private List<String> data = new ArrayList<String>();

  public Player(String name, int health, int level) {
    this.name = name;
    this.health = health;
    this.level = level;

    data.add(name);
    data.add(weapon);
    data.add(String.valueOf(health));
    data.add(String.valueOf(level));
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
  public void read(List<String> dataSource) {
    this.data = dataSource;
  }

  @Override
  public List<String> write() {
    return data;
  }

  @Override
  public String toString() {
    return (
      "Player: " + name + ";  " +
      "Weapon: " + weapon + ";  " +
      "Health: " + health + ";  " +
      "Level: " + level
    );
  }
}
