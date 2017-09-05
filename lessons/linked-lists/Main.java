import java.util.ArrayList;

public class Main {
  public static ArrayList<Album> myAlbums = new ArrayList<Album>();

  public static void main(String[] args) {
    ArrayList<Song> lugalKiEnSongs = new ArrayList<Song>();
    lugalKiEnSongs.add(new Song("Senseless Massacre", "3:34"));
    lugalKiEnSongs.add(new Song("Desolate Paradise", "3:25"));
    lugalKiEnSongs.add(new Song("Lalassu Xul", "3:39"));
    lugalKiEnSongs.add(new Song("Infused", "3:21"));
    lugalKiEnSongs.add(new Song("Fractal Intake", "0:40"));

    Album lugalKiEn = new Album("Lugal Ki En", lugalKiEnSongs);

    myAlbums.add(lugalKiEn);

    ArrayList<Song> ultuUllaSongs = new ArrayList<Song>();
    ultuUllaSongs.add(new Song("Servant of this Sentience", "4:16"));
    ultuUllaSongs.add(new Song("Parallel Shift", "3:49"));
    ultuUllaSongs.add(new Song("Unhallowed", "1:01"));
    ultuUllaSongs.add(new Song("Immemorial Essence", "4:44"));
    ultuUllaSongs.add(new Song("The Relic", "4:46"));

    Album ultuUlla = new Album("Ultu Ulla", ultuUllaSongs);

    myAlbums.add(ultuUlla);

    Playlist workoutTunes = new Playlist("Workout Tunes");

    addSongToPlaylist("Senseless Massacre", workoutTunes);
    addSongToPlaylist("Lalassu Xul", workoutTunes);
    addSongToPlaylist("Infused", workoutTunes);
    addSongToPlaylist("Servant of this Sentience", workoutTunes);
    addSongToPlaylist("Immemorial Essence", workoutTunes);
    addSongToPlaylist("Parallel Shift", workoutTunes);
    addSongToPlaylist("Test", workoutTunes);

    workoutTunes.play();
  }

  private static Song getSong(String songTitle) {
    for (Album album : myAlbums) {
      Song match = album.getSong(songTitle);

      if (match != null) return match;
    }

    System.out.println("No song with title " + songTitle + " was found.");
    return null;
  }

  private static boolean addSongToPlaylist(String songTitle, Playlist playlist) {
    Song song = getSong(songTitle);

    if (song != null) {
      System.out.println("Adding " + songTitle + " to " + playlist.getName() + ".");
      playlist.addSong(song);

      return true;
    }

    return false;
  }
}
