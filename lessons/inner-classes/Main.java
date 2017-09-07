import java.util.ArrayList;

public class Main {
  public static ArrayList<Album> myAlbums = new ArrayList<Album>();

  public static void main(String[] args) {
    Album lugalKiEn = new Album("Lugal Ki En");
    lugalKiEn.addSong("Senseless Massacre", "3:34");
    lugalKiEn.addSong("Desolate Paradise", "3:25");
    lugalKiEn.addSong("Lalassu Xul", "3:39");
    lugalKiEn.addSong("Infused", "3:21");
    lugalKiEn.addSong("Fractal Intake", "0:40");


    myAlbums.add(lugalKiEn);

    Album ultuUlla = new Album("Ultu Ulla");
    ultuUlla.addSong("Servant of this Sentience", "4:16");
    ultuUlla.addSong("Parallel Shift", "3:49");
    ultuUlla.addSong("Unhallowed", "1:01");
    ultuUlla.addSong("Immemorial Essence", "4:44");
    ultuUlla.addSong("The Relic", "4:46");


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
