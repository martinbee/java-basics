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
  }

  private static Song getSong(String songTitle) {
    for (Album album : myAlbums) {
      Song match = album.getSong(songTitle);

      if (match != null) return match;
    }

    System.out.println("No song with title " + songTitle + " was found.");
    return null;
  }
}

// Create a program that implements a playlist for songs
// The albums will be stored in an ArrayList
// Songs from different albums can be added to the playlist and will appear in the list in the order
// they are added.
// Once the songs have been added to the playlist, create a menu of options to:-
// Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
// List the songs in the playlist
// A song must exist in an album before it can be added to the playlist (so you can only play songs that
// you own).
// Hint:  To replay a song, consider what happened when we went back and forth from a city before we
// started tracking the direction we were going.
// As an optional extra, provide an option to remove the current song from the playlist
// (hint: listiterator.remove()
