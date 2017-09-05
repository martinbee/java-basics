import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;

public class Playlist {
  private String name;
  private LinkedList<Song> songs = new LinkedList<Song>();

  public Playlist(String name) {
    this.name = name;
  }

  public void addSong(Song newSong) {
    songs.add(newSong);
  }

  public void listSongs() {
    System.out.println("Playlist " + name + " has these songs:\n");

    Iterator<Song> iterator = songs.iterator();

    while(iterator.hasNext()) {
      Song currentSong = iterator.next();

      System.out.println(
        "Title: " + currentSong.getTitle() + "; Duration: "
        + currentSong.getDuration()
      );
    }
  }
}
