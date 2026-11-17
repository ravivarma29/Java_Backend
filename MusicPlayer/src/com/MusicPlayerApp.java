package com;

import java.util.Scanner;

/**
 * Main application class for the Music Player.
 * Provides a console-based menu interface for managing songs and playlists.
 */
public class MusicPlayerApp {
	public static void main(String[] args) {
		MusicPlayer player = new MusicPlayer();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("========================================");
		System.out.println("    WELCOME TO MUSIC PLAYER");
		System.out.println("========================================\n");
		
		boolean running = true;
		while (running) {
			displayMenu();
			System.out.print("Enter your choice: ");
			int choice = -1;
			try {
				choice = scanner.nextInt();
				scanner.nextLine(); // Consume newline
			} catch (Exception e) {
				scanner.nextLine(); // Clear invalid input
				System.out.println("Invalid input! Please enter a number.\n");
				continue;
			}
			
			System.out.println(); // Blank line for readability
			switch (choice) {
				case 1:
					addNewSong(player, scanner);
					break;
				case 2:
					updateExistingSong(player, scanner);
					break;
				case 3:
					deleteSong(player, scanner);
					break;
				case 4:
					player.displayAllSongs();
					break;
				case 5:
					createNewPlaylist(player,scanner);
					break;
				case 6:
					addSongToPlaylist(player, scanner);
					break;
				case 7:
					player.displayAllPlaylists();
					break;
				case 8:
					playSongInPlaylist(player, scanner);
					break;
				case 9:
					pauseSongInPlaylist(player, scanner);
					break;
				case 10:
					stopSongInPlaylist(player, scanner);
					break;
				case 11:
					running = false;
					System.out.println("========================================");
					System.out.println("  Thank you for using Music Player!");
					System.out.println("========================================");
					break;
				default:
					System.out.println("Invalid option! Please choose 1-11.\n");
			}
		}
		scanner.close();
	}
	
	/**
	 * Displays the main menu options.
	 */
	public static void displayMenu() {
		System.out.println("\n========== Music Player Menu ==========");
		System.out.println("1.  Add New Song");
		System.out.println("2.  Update Existing Song");
		System.out.println("3.  Delete Song");
		System.out.println("4.  Display All Songs");
		System.out.println("5.  Create New Playlist");
		System.out.println("6.  Add Song to Playlist");
		System.out.println("7.  Display All Playlists");
		System.out.println("8.  Play Song in Playlist");
		System.out.println("9.  Pause Song in Playlist");
		System.out.println("10. Stop Song in Playlist");
		System.out.println("11. Exit");
		System.out.println("=======================================");
	}
	/**
	 * Prompts the user to add a new song to the library.
	 */
	public static void addNewSong(MusicPlayer player, Scanner scanner) {
		System.out.print("Enter Song Title: ");
		String title = scanner.nextLine();
		System.out.print("Enter Artist Name: ");
		String artist = scanner.nextLine();
		System.out.print("Enter Song Duration (in minutes): ");
		double duration = scanner.nextDouble();
		scanner.nextLine(); // Consume newline
		
		Song newSong = new Song(title, artist, duration);
		player.addSong(newSong);
		System.out.println();
	}
	
	/**
	 * Prompts the user to update an existing song's details.
	 */
	private static void updateExistingSong(MusicPlayer player, Scanner scanner) {
		System.out.print("Enter current song title: ");
		String oldTitle = scanner.nextLine();
		
		System.out.print("Enter new song title: ");
		String newTitle = scanner.nextLine();
		System.out.print("Enter new artist name: ");
		String newArtist = scanner.nextLine();
		System.out.print("Enter new song duration (in minutes): ");
		double newDuration = scanner.nextDouble();
		scanner.nextLine(); // Consume newline
		
		Song updatedSong = new Song(newTitle, newArtist, newDuration);
		player.updateSong(oldTitle, updatedSong);
		System.out.println();
	}
	
	/**
	 * Prompts the user to delete a song from the library.
	 */
	private static void deleteSong(MusicPlayer player, Scanner scanner) {
		System.out.print("Enter song title to delete: ");
		String title = scanner.nextLine();
		player.deleteSong(title);
		System.out.println();
	}

	/**
	 * Prompts the user to create a new playlist.
	 */
	private static void createNewPlaylist(MusicPlayer player, Scanner scanner) {
		System.out.print("Enter playlist name: ");
		String name = scanner.nextLine();
		player.createPlaylist(name);
		System.out.println();
	}
	
	/**
	 * Prompts the user to add a song to a playlist.
	 */
	private static void addSongToPlaylist(MusicPlayer player, Scanner scanner) {
		System.out.print("Enter playlist name: ");
		String playlistName = scanner.nextLine();
		System.out.print("Enter song title: ");
		String songTitle = scanner.nextLine();
		
		player.addSongToPlaylistByTitle(playlistName, songTitle);
		System.out.println();
	}
	/**
	 * Prompts the user to play a song in a playlist.
	 */
	private static void playSongInPlaylist(MusicPlayer player, Scanner scanner) {
		System.out.print("Enter playlist name: ");
		String playlistName = scanner.nextLine();
		Playlist playlist = player.getPlaylist(playlistName);
		
		if (playlist != null) {
			System.out.println("1. By Title");
			System.out.println("2. By ID");
			System.out.print("Enter your choice: ");
			String choice = scanner.nextLine();
			
			if (choice.equals("1")) {
				System.out.print("Enter song title: ");
				String title = scanner.nextLine();
				playlist.play(title);
			} else if (choice.equals("2")) {
				System.out.print("Enter song ID: ");
				int id = scanner.nextInt();
				scanner.nextLine(); // Consume newline
				playlist.play(id);
			} else {
				System.out.println("Invalid choice!");
			}
		} else {
			System.out.println("Playlist not found!");
		}
		System.out.println();
	}
	/**
	 * Prompts the user to pause a song in a playlist.
	 */
	private static void pauseSongInPlaylist(MusicPlayer player, Scanner scanner) {
		System.out.print("Enter playlist name: ");
		String playlistName = scanner.nextLine();
		Playlist playlist = player.getPlaylist(playlistName);
		
		if (playlist != null) {
			System.out.println("1. By Title");
			System.out.println("2. By ID");
			System.out.print("Enter your choice: ");
			String choice = scanner.nextLine();
			
			if (choice.equals("1")) {
				System.out.print("Enter song title: ");
				String title = scanner.nextLine();
				playlist.pause(title);
			} else if (choice.equals("2")) {
				System.out.print("Enter song ID: ");
				int id = scanner.nextInt();
				scanner.nextLine(); // Consume newline
				playlist.pause(id);
			} else {
				System.out.println("Invalid choice!");
			}
		} else {
			System.out.println("Playlist not found!");
		}
		System.out.println();
	}
	/**
	 * Prompts the user to stop a song in a playlist.
	 */
	private static void stopSongInPlaylist(MusicPlayer player, Scanner scanner) {
		System.out.print("Enter playlist name: ");
		String playlistName = scanner.nextLine();
		Playlist playlist = player.getPlaylist(playlistName);
		
		if (playlist != null) {
			System.out.println("1. By Title");
			System.out.println("2. By ID");
			System.out.print("Enter your choice: ");
			String choice = scanner.nextLine();
			
			if (choice.equals("1")) {
				System.out.print("Enter song title: ");
				String title = scanner.nextLine();
				playlist.stop(title);
			} else if (choice.equals("2")) {
				System.out.print("Enter song ID: ");
				int id = scanner.nextInt();
				scanner.nextLine(); // Consume newline
				playlist.stop(id);
			} else {
				System.out.println("Invalid choice!");
			}
		} else {
			System.out.println("Playlist not found!");
		}
		System.out.println();
	}
}
