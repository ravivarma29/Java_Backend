package com;

/**
 * Interface defining playback operations for music.
 * Supports operations by song title or song ID.
 */
public interface Playable {
	/**
	 * Play a song by its title.
	 * @param title the title of the song
	 */
	void play(String title);
	
	/**
	 * Play a song by its ID.
	 * @param songId the ID of the song
	 */
	void play(int songId);
	
	/**
	 * Pause a song by its title.
	 * @param title the title of the song
	 */
	void pause(String title);
	
	/**
	 * Pause a song by its ID.
	 * @param songId the ID of the song
	 */
	void pause(int songId);
	
	/**
	 * Stop a song by its title.
	 * @param title the title of the song
	 */
	void stop(String title);
	
	/**
	 * Stop a song by its ID.
	 * @param songId the ID of the song
	 */
	void stop(int songId);
}
