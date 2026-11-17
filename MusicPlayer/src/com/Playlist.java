package com;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a Playlist that contains multiple songs.
 * Implements Playable interface for playback operations.
 */
public class Playlist implements Playable {
	private int playlistId;
	private String playlistName;
	private List<Song> songs;
	private static int idCounter = 1;
	
	/**
	 * Constructor to create a new Playlist.
	 * @param playlistName the name of the playlist
	 */
	public Playlist(String playlistName) {
		this.playlistId = idCounter++;
		this.playlistName = playlistName;
		this.songs = new ArrayList<>();
	}

	public int getPlaylistId() {
		return playlistId;
	}

	public void setPlaylistId(int playlistId) {
		this.playlistId = playlistId;
	}

	public String getPlaylistName() {
		return playlistName;
	}

	public void setPlaylistName(String playlistName) {
		this.playlistName = playlistName;
	}

	public List<Song> getSongs() {
		return songs;
	}

	public void setSongs(List<Song> songs) {
		this.songs = songs;
	}

	@Override
	public String toString() {
		return "Playlist [playlistId=" + playlistId + ", playlistName=" + playlistName + ", songs=" + songs + "]";
	}
	
	/**
	 * Adds a song to the playlist.
	 * Prevents duplicate songs from being added.
	 * @param song the song to add
	 */
	public void addSong(Song song) {
		if (songs.contains(song)) {
			System.out.println("Song already exists in the playlist.");
		} else {
			songs.add(song);
			System.out.println("Added '" + song.getTitle() + "' to the playlist: " + playlistName);
		}
	}
	
	/**
	 * Removes a song from the playlist by title.
	 * @param title the title of the song to remove
	 */
	public void removeSong(String title) {
		Song toRemove = null;
		for (Song song : songs) {
			if (song.getTitle().equalsIgnoreCase(title)) {
				toRemove = song;
				break;
			}
		}
		if (toRemove == null) {
			System.out.println("Song '" + title + "' not found in the playlist.");
		} else {
			songs.remove(toRemove);
			System.out.println("Removed '" + title + "' from the playlist: " + playlistName);
		}
	}
	
	/**
	 * Removes a song from the playlist by song ID.
	 * @param songId the ID of the song to remove
	 */
	public void removeSong(int songId) {
		Song toRemove = null;
		for (Song song : songs) {
			if (song.getSongId() == songId) {
				toRemove = song;
				break;
			}
		}
		if (toRemove == null) {
			System.out.println("Song ID " + songId + " not found in the playlist.");
		} else {
			songs.remove(toRemove);
			System.out.println("Removed '" + toRemove.getTitle() + "' (ID: " + songId + ") from the playlist: " + playlistName);
		}
	}
	
	/**
	 * Displays all songs in the playlist with numbering.
	 */
	public void displaySongs() {
		if (songs.isEmpty()) {
			System.out.println(playlistName + " is empty!");
			return;
		}
		System.out.println("==================== " + playlistName + " ====================");
		for (int i = 0; i < songs.size(); i++) {
			System.out.println((i + 1) + ". " + songs.get(i));
		}
		System.out.println("=======================================================");
	}
	
	@Override
	public void play(String title) {
		for (Song song : songs) {
			if (song.getTitle().equalsIgnoreCase(title)) {
				System.out.println("Playing '" + song.getTitle() + "' from playlist: " + playlistName);
				return;
			}
		}
		System.out.println("Song '" + title + "' not found in playlist!");
	}
	
	@Override
	public void play(int songId) {
		for (Song song : songs) {
			if (song.getSongId() == songId) {
				System.out.println("Playing '" + song.getTitle() + "' (ID: " + songId + ") from playlist: " + playlistName);
				return;
			}
		}
		System.out.println("Song ID " + songId + " not found in playlist!");
	}
	
	@Override
	public void pause(String title) {
		for (Song song : songs) {
			if (song.getTitle().equalsIgnoreCase(title)) {
				System.out.println("Paused '" + song.getTitle() + "' from playlist: " + playlistName);
				return;
			}
		}
		System.out.println("Song '" + title + "' not found in playlist!");
	}
	
	@Override
	public void pause(int songId) {
		for (Song song : songs) {
			if (song.getSongId() == songId) {
				System.out.println("Paused '" + song.getTitle() + "' (ID: " + songId + ") from playlist: " + playlistName);
				return;
			}
		}
		System.out.println("Song ID " + songId + " not found in playlist!");
	}
	
	@Override
	public void stop(String title) {
		for (Song song : songs) {
			if (song.getTitle().equalsIgnoreCase(title)) {
				System.out.println("Stopped '" + song.getTitle() + "' from playlist: " + playlistName);
				return;
			}
		}
		System.out.println("Song '" + title + "' not found in playlist!");
	}
	
	@Override
	public void stop(int songId) {
		for (Song song : songs) {
			if (song.getSongId() == songId) {
				System.out.println("Stopped '" + song.getTitle() + "' (ID: " + songId + ") from playlist: " + playlistName);
				return;
			}
		}
		System.out.println("Song ID " + songId + " not found in playlist!");
	}
}

