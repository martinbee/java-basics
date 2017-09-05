import java.util.ArrayList;

public class Album {
  private String name;
  private ArrayList<Song> songs;

  public Album(String name, ArrayList<Song> songs) {
    this.name = name;
    this.songs = songs;
  }

  public Song getSong(String songTitle) {
    for (Song song : songs) {
      if (song.getTitle().equals(songTitle)) return song;
    }

    return null;
  }
}
