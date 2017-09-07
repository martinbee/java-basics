public interface DataList {
  ListItem getRoot();
  boolean addItem(Object itemValue);
  boolean removeItem(ListItem item);
  void traverse(ListItem root);
}
