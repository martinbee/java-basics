import java.util.ArrayList;

public class Album {
  private String name;
  private SongList songList;

  public Album(String name) {
    this.name = name;
    this.songList = new SongList();
  }

  public Song getSong(String songTitle) {
    return songList.getSong(songTitle);
  }

  public void addSong(String title, String duration) {
    songList.addSong(title, duration);
  }

  public class SongList {
    private ArrayList<Song> songs = new ArrayList<Song>();

    public Song getSong(String songTitle) {
      for (Song song : songs) {
        if (song.getTitle().equals(songTitle)) return song;
      }

      return null;
    }

    public void addSong(String title, String duration) {
      songs.add(new Song(title, duration));
    }
  }
}
