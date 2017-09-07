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
    System.out.println("\nPlaylist " + name + " has these songs:\n");

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
    ListIterator<Song> listIterator = songs.listIterator();

    boolean quit = false;
    boolean goingForwards = true;

    if (songs.isEmpty()) {
      System.out.println("No songs in playlist " + name + ". Add songs and try again. Exiting...");

      return;
    }

    System.out.println("\nPlaylist " + name + " is playing " + listIterator.next().getTitle());
    printOptions();

    while (!quit) {
      int selection = scanner.nextInt();
      scanner.nextLine();

      switch (selection) {
        case 0:
          System.out.println("\nStopping playlist " + name + "...");
          quit = true;

          break;
        case 1:
          if (!goingForwards) {
            if (listIterator.hasNext()) {
              listIterator.next();
            }

            goingForwards = true;
          }

          if (listIterator.hasNext()) {
            System.out.println("\nNow playing " + listIterator.next().getTitle());
          } else {
            System.out.println("\nAt end of playlist.");
          }

          break;
        case 2:
          if (goingForwards) {
            if (listIterator.hasPrevious()) {
              listIterator.previous();
            }

            goingForwards = false;
          }

          if (listIterator.hasPrevious()) {
            System.out.println("\nNow playing " + listIterator.previous().getTitle());
          } else {
            System.out.println("\nAt beginning of playlist.");
          }

          break;
        case 3: {
          Song currentSong;

          if (goingForwards) {
            currentSong = listIterator.previous();
            listIterator.next();
          } else {
            currentSong = listIterator.next();
            listIterator.previous();
          }

          System.out.println("\nRestarting " + currentSong.getTitle() + "...");
          break;
        }
        case 4:
          listSongs();
          break;
        case 5: {
          listIterator.remove();

          if (songs.isEmpty()) {
            System.out.println("No more songs left in playlist. Exiting...");
            quit = true;
          }

          if (listIterator.hasNext()) {
            System.out.println("\nNow playing " + listIterator.next().getTitle());
          } else if (listIterator.hasPrevious()) {
            System.out.println("\nNow playing " + listIterator.previous().getTitle());
          }

          break;
        }
        default:
          printOptions();
          break;
      }
    }
  }

  private void printOptions() {
    System.out.println("\nPlaylist Options\n");
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

// As an optional extra, provide an option to remove the current song from the playlist
// (hint: listiterator.remove()
