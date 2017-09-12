public class LinkedList implements DataList {
  private ListItem root = null;

  public LinkedList(Object rootValue) {
    this.root = new DataItem(rootValue);
  }

  @Override
  public ListItem getRoot() {
    return this.root;
  }

  @Override
  public boolean addItem(Object newItemValue) {
    ListItem newItem= new DataItem(newItemValue);

    if (this.root == null) {
      this.root = newItem;

      return true;
    }

    ListItem currentItem = this.root;

    while (currentItem != null) {
      int comparison = (currentItem.compareTo(newItem));

      if (comparison < 0) {
        // newItem is greater, move right if possible
        ListItem nextItem = currentItem.next();

        if (nextItem != null) {
          currentItem = nextItem;
        } else {
          // there is no next, so insert at end of list
          currentItem.setNext(newItem);
          newItem.setPrevious(currentItem);

          return true;
        }
      } else if (comparison > 0) {
        // newItem is less, insert before
        ListItem previousItem = currentItem.previous();

        if (previousItem != null) {
          previousItem.setNext(newItem);
          newItem.setPrevious(previousItem);
          newItem.setNext(currentItem);
          currentItem.setPrevious(newItem);
        } else {
          // the node with a previous is the root
          newItem.setNext(this.root);
          this.root.setPrevious(newItem);
          this.root = newItem;
        }

        return true;
      } else {
        // equal
        System.out.println(newItem.getValue() + " is already present, not added.");
        return false;
      }
    }

    return false;
  }

  @Override
  public boolean removeItem(ListItem item) {
    if (item != null) System.out.println("Deleting " + item.getValue() + " from the list.");

    ListItem currentItem = this.root;

    while (currentItem != null) {
      int comparison = currentItem.compareTo(item);

      if (comparison == 0) {
        ListItem nextItem = currentItem.next();
        ListItem previousItem = currentItem.previous();

        boolean noNextItem = nextItem == null;
        boolean noPreviousItem = previousItem == null;

        if (noNextItem && noPreviousItem) {
          this.root = null;

          return true;
        }

        if (noNextItem) {
          previousItem.setNext(null);

          return true;
        }

        if (noPreviousItem) {
          nextItem.setPrevious(null);

          return true;
        }

        previousItem.setNext(nextItem);
        nextItem.setPrevious(previousItem);

        return true;
      } else {
        currentItem = currentItem.next();
      }
    }

    return false;
  }

  @Override
  public void traverse(ListItem root) {
    ListItem currentItem = root;

    if (currentItem == null) {
      System.out.println("The list is empty");
    } else {
      while (currentItem != null) {
        System.out.println("Item " + currentItem.getValue());

        currentItem = currentItem.next();
      }
    }
  }
}
