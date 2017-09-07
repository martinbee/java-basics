import java.util.List;
import java.util.ArrayList;

public class Monster implements ISaveable {
  private String type;
  private String alignment = "Chaotic Evil";
  private int health;
  private int damage;

  public Monster(String type, String alignment, int health, int damage) {
    this.type = type;
    this.alignment = alignment;
    this.health = health;
    this.damage = damage;
  }

  public boolean setHealth(int health) {
    this.health = health;

    return true;
  }

  public boolean setDamage(int damage) {
    this.damage = damage;

    return true;
  }

  public int attackPlayer(Player player) {
    player.receiveDamage(damage);

    return damage;
  }

  @Override
  public void read(List<Data> dataSource) {
    for (Data dataItem : dataSource) {
      String key = dataItem.getKey();

      switch (key) {
        case "type":
          this.type = dataItem.getValue();
          break;
        case "alignment":
          this.alignment = dataItem.getValue();
          break;
        case "health":
          this.health = Integer.parseInt(dataItem.getValue());
          break;
        case "damage":
          this.damage = Integer.parseInt(dataItem.getValue());
          break;
        default:
          System.out.println(key + " is not a valid field on Monster.");
          break;
      }
    }
  }

  @Override
  public List<Data> write() {
    List<Data> dataToSave = new ArrayList<Data>();

    dataToSave.add(new Data("type", type));
    dataToSave.add(new Data("alignment", alignment));
    dataToSave.add(new Data("health", String.valueOf(health)));
    dataToSave.add(new Data("damage", String.valueOf(damage)));

    return dataToSave;
  }

  @Override
  public String toString() {
    return (
      "Monster: {\n" +
      "  Type: " + type + ",\n" +
      "  Alignment: " + alignment + ",\n" +
      "  Health: " + health + ",\n" +
      "  Damage: " + damage + ",\n" +
      "};"
    );
  }
}
