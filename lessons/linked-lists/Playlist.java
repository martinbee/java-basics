import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;
import java.util.Scanner;

public class Playlist {
  private String name;
  private LinkedList<Song> songs = new LinkedList<Song>();

  public Playlist(String name) {
    this.name = name;
  }

  public void addSong(Song newSong) {
    songs.add(newSong);
  }

  private void listSongs() {
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

  public void play() {
    Scanner scanner = new Scanner(System.in);

    printOptions();

    int selection = scanner.nextInt();
    scanner.nextLine();

    System.out.println(selection);
  }

// 0 quit
// 1 skip forwards
// 2 skip backwards
// 3 restart current song
// 4 list songs
// 5 remove currentSong
  private void printOptions() {
    System.out.println("\nPlaylist Options\n");
    System.out.println("Press your selection:\n");
    System.out.println("0 - stop playing playlist.");
    System.out.println("1 - skip forwards.");
    System.out.println("2 - skip backwards.");
    System.out.println("3 - restart current song.");
    System.out.println("4 - list playlist songs.");
    System.out.println("5 - remove current song from playlist.");
    System.out.println("6 - list options.");
  }

  public String getName() {
    return name;
  }
}

// Hint:  To replay a song, consider what happened when we went back and forth from a city before we
// started tracking the direction we were going.
// As an optional extra, provide an option to remove the current song from the playlist
// (hint: listiterator.remove()
