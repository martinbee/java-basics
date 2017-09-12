public class DataItem extends ListItem {
  public DataItem(Object value) {
    super(value);
  }

  @Override
  public ListItem previous() {
    return leftLink;
  }

  @Override
  public ListItem next() {
    return rightLink;
  }

  @Override
  public ListItem setPrevious(ListItem item) {
    this.leftLink = item;

    return item;
  }

  @Override
  public ListItem setNext(ListItem item) {
    this.rightLink = item;

    return item;
  }

  @Override
  public int compareTo(ListItem item) {
    if (item.getValue() == null) return -1;

    String compareValue = (String) item.getValue();
    String castValue = (String) value;

    return castValue.compareTo(compareValue);
  }
}
