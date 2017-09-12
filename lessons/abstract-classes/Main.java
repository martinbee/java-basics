public class Main {
  public static void main(String[] args) {
    String[] listWords = new String[] {
      "Singapore",
      "Bangkok",
      "Saigon",
      "Kuala Lumpur",
      "Yangon",
    };

    LinkedList list = new LinkedList("Beijing");
    list.traverse(list.getRoot());

    for (String word: listWords) {
      list.addItem(word);
    }

    list.traverse(list.getRoot());
    list.removeItem(new DataItem("Singapore"));
    list.traverse(list.getRoot());
  }
}
