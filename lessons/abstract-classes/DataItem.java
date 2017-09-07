public class DataItem extends ListItem {
  public DataItem(Object value) {
    super(value);
  }

  @Override
  public boolean hasNext() {
    if (nextItem == null) return false;

    return true;
  }

  @Override
  public boolean hasPrevious() {
    if (previousItem == null) return false;

    return true;
  }

  @Override
  public ListItem previous() {
    return previousItem;
  }

  @Override
  public ListItem next() {
    return nextItem;
  }

  @Override
  public void setPreviousItem(ListItem previousItem) {
    this.previousItem = previousItem;
  }

  @Override
  public void setNextItem(ListItem nextItem) {
    this.nextItem = nextItem;
  }

  @Override
  public int compareTo(ListItem item) {
    if (item == null) return -1;

    String compareValue = (String) item.getValue();
    String castValue = (String) value;

    return castValue.compareTo(compareValue);
  }
}
