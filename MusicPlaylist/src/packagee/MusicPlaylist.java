package packagee;

import java.util.LinkedList;
import java.util.Scanner;

public class MusicPlaylist {
    private LinkedList<String> playlist;

    public MusicPlaylist() {
        playlist = new LinkedList<>();
    }

    public void addSong(String song) {
        playlist.add(song);
        System.out.println("Song added: " + song);
    }

    public void removeSong(String song) {
        if (playlist.remove(song)) {
            System.out.println("Song removed: " + song);
        } else {
            System.out.println("Song not found: " + song);
        }
    }

    public void moveSong(int oldIndex, int newIndex) {
        if (oldIndex >= 0 && oldIndex < playlist.size() && newIndex >= 0 && newIndex < playlist.size()) {
            String song = playlist.remove(oldIndex);
            playlist.add(newIndex, song);
            System.out.println("Moved song: " + song + " to position " + (newIndex + 1));
        } else {
            System.out.println("Invalid indices.");
        }
    }

    public void displayPlaylist() {
        if (playlist.isEmpty()) {
            System.out.println("Playlist is empty.");
        } else {
            System.out.println("Playlist:");
            for (int i = 0; i < playlist.size(); i++) {
                System.out.println((i + 1) + ". " + playlist.get(i));
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MusicPlaylist musicPlaylist = new MusicPlaylist();
        boolean running = true;

        while (running) {
            System.out.println("\nMusic Playlist");
            System.out.println("1. Add Song");
            System.out.println("2. Remove Song");
            System.out.println("3. Move Song");
            System.out.println("4. Display Playlist");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter song name: ");
                    String song = scanner.nextLine();
                    musicPlaylist.addSong(song);
                    break;
                case 2:
                    System.out.print("Enter song name to remove: ");
                    song = scanner.nextLine();
                    musicPlaylist.removeSong(song);
                    break;
                case 3:
                    System.out.print("Enter current song index: ");
                    int oldIndex = scanner.nextInt() - 1;
                    System.out.print("Enter new song index: ");
                    int newIndex = scanner.nextInt() - 1;
                    musicPlaylist.moveSong(oldIndex, newIndex);
                    break;
                case 4:
                    musicPlaylist.displayPlaylist();
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        scanner.close();
    }
}
