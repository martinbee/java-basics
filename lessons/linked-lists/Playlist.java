import java.util.LinkedList;
import java.util.ListIterator;

public class Playlist {
  private String name;
  private LinkedList<Song> songs = new LinkedList<Song>();

  public Playlist(String name) {
    this.name = name;
  }

  public void addSong(Song newSong) {
    songs.add(newSong);
  }
}
