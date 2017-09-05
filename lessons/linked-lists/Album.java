import java.util.ArrayList;

public class Album {
  private String name;
  private ArrayList<Song> songs;

  public Album(String name, ArrayList<Song> songs) {
    this.name = name;
    this.songs = songs;
  }

  public boolean hasSong(String songTitle) {
    for (Song song : songs) {
      if (song.getTitle().equals(songTitle)) return true;
    }

    return false;
  }
}

// The program will have an Album class containing a list of songs.
