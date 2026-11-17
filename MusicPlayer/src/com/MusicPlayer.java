package com;

import java.util.ArrayList;
import java.util.List;

/**
 * MusicPlayer class manages a collection of songs and playlists.
 * Provides CRUD operations for songs and playlists.
 */
public class MusicPlayer {
	private List<Song> allSongs;
	private List<Playlist> playlists;
	
	/**
	 * Constructor initializes empty lists for songs and playlists.
	 */
	public MusicPlayer() {
		this.allSongs = new ArrayList<>();
		this.playlists = new ArrayList<>();
	}
	
	/**
	 * Adds a song to the library.
	 * @param song the song to add
	 */
	public void addSong(Song song) {
		allSongs.add(song);
		System.out.println("Song added successfully!");
	}
	
	/**
	 * Updates an existing song's details.
	 * @param oldTitle the current title of the song
	 * @param newSong the updated song object with new details
	 */
	public void updateSong(String oldTitle, Song newSong) {
		Song song = findSongByTitle(oldTitle);
		if (song != null) {
			song.setTitle(newSong.getTitle());
			song.setArtist(newSong.getArtist());
			song.setDuration(newSong.getDuration());
			System.out.println("Song updated successfully!");
		} else {
			System.out.println("Song not found!");
		}
	}
	
	/**
	 * Deletes a song from the library by title.
	 * @param title the title of the song to delete
	 */
	public void deleteSong(String title) {
		Song song = findSongByTitle(title);
		if (song != null) {
			allSongs.remove(song);
			System.out.println("Song deleted successfully!");
		} else {
			System.out.println("Song not found!");
		}
	}
	
	/**
	 * Finds a song in the library by its title (case-insensitive).
	 * @param title the title to search for
	 * @return the Song object if found, null otherwise
	 */
	private Song findSongByTitle(String title) {
		for (Song song : allSongs) {
			if (song.getTitle().equalsIgnoreCase(title)) {
				return song;
			}
		}
		return null;
	}
	
	/**
	 * Finds a song in the library by its ID.
	 * @param songId the song ID to search for
	 * @return the Song object if found, null otherwise
	 */
	private Song findSongById(int songId) {
		for (Song song : allSongs) {
			if (song.getSongId() == songId) {
				return song;
			}
		}
		return null;
	}
	
	/**
	 * Displays all songs in the library.
	 */
	public void displayAllSongs() {
		if (allSongs.isEmpty()) {
			System.out.println("No songs available.");
			return;
		}
		System.out.println("==================== All Songs ====================");
		for (int i = 0; i < allSongs.size(); i++) {
			System.out.println((i + 1) + ". " + allSongs.get(i));
		}
		System.out.println("===================================================");
	}
	
	/**
	 * Creates a new playlist and adds it to the collection.
	 * @param name the name of the playlist
	 */
	public void createPlaylist(String name) {
		Playlist newPlaylist = new Playlist(name);
		playlists.add(newPlaylist);
		System.out.println("Playlist '" + name + "' created successfully!");
	}
	
	/**
	 * Adds a song to a specific playlist.
	 * @param playlistName the name of the playlist
	 * @param song the song to add
	 */
	public void addSongToPlaylist(String playlistName, Song song) {
		Playlist playlist = getPlaylist(playlistName);
		
		if (song != null && playlist != null) {
			playlist.addSong(song);
		} else {
			if (song == null) {
				System.out.println("Song not found.");
			}
			if (playlist == null) {
				System.out.println("Playlist not found.");
			}
		}
	}
	
	/**
	 * Adds a song to a playlist by searching for the song by title.
	 * @param playlistName the name of the playlist
	 * @param songTitle the title of the song to add
	 */
	public void addSongToPlaylistByTitle(String playlistName, String songTitle) {
		Song song = findSongByTitle(songTitle);
		addSongToPlaylist(playlistName, song);
	}
	
	/**
	 * Deletes a playlist from the collection.
	 * @param playlistName the name of the playlist to delete
	 */
	public void deletePlaylist(String playlistName) {
		Playlist playlist = getPlaylist(playlistName);
		
		if (playlist != null) {
			playlists.remove(playlist);
			System.out.println("Playlist '" + playlistName + "' deleted successfully!");
		} else {
			System.out.println("Playlist not found.");
		}
	}
	
	/**
	 * Displays all playlists in the collection.
	 */
	public void displayAllPlaylists() {
		if (playlists.isEmpty()) {
			System.out.println("No playlists found.");
			return;
		}
		System.out.println("==================== All Playlists ====================");
		for (int i = 0; i < playlists.size(); i++) {
			System.out.println((i + 1) + ". " + playlists.get(i));
		}
		System.out.println("=======================================================");
	}
	
	/**
	 * Plays all songs in a playlist sequentially.
	 * @param playlistName the name of the playlist to play
	 */
	public void playPlaylist(String playlistName) {
		Playlist playlist = getPlaylist(playlistName);
		
		if (playlist != null) {
			if (playlist.getSongs().isEmpty()) {
				System.out.println("Playlist is empty.");
				return;
			}
			System.out.println("Playing all songs from playlist: " + playlistName);
			for (Song song : playlist.getSongs()) {
				System.out.println("  Now playing: " + song.getTitle());
			}
		} else {
			System.out.println("Playlist not found.");
		}
	}

	/**
	 * Gets the list of all songs in the library.
	 * @return list of all songs
	 */
	public List<Song> getAllSongs() {
		return allSongs;
	}

	/**
	 * Sets the list of all songs in the library.
	 * @param allSongs the list of songs to set
	 */
	public void setAllSongs(List<Song> allSongs) {
		this.allSongs = allSongs;
	}

	/**
	 * Gets the list of all playlists.
	 * @return list of all playlists
	 */
	public List<Playlist> getPlaylists() {
		return playlists;
	}

	/**
	 * Sets the list of playlists.
	 * @param playlists the list of playlists to set
	 */
	public void setPlaylists(List<Playlist> playlists) {
		this.playlists = playlists;
	}
	
	/**
	 * Retrieves a playlist by its name (case-insensitive).
	 * @param name the name of the playlist
	 * @return the Playlist object if found, null otherwise
	 */
	public Playlist getPlaylist(String name) {
		for (Playlist playlist : playlists) {
			if (playlist.getPlaylistName().equalsIgnoreCase(name)) {
				return playlist;
			}
		}
		return null;
	}
}

