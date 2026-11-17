package com;

/**
 * Represents a Song with id, title, artist, and duration.
 * Song IDs are auto-generated using a static counter.
 */
public class Song {
	private int songId;
	private String title;
	private String artist;
	private double duration; // in minutes
	private static int idCounter = 1;
	
	/**
	 * Constructor to create a new Song.
	 * @param title the title of the song
	 * @param artist the artist name
	 * @param duration the duration in minutes
	 */
	public Song(String title, String artist, double duration) {
		this.songId = idCounter++;
		this.title = title;
		this.artist = artist;
		this.duration = duration;
	}
	
	public int getSongId() {
		return songId;
	}
	
	public void setSongId(int songId) {
		this.songId = songId;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public double getDuration() {
		return duration;
	}
	
	public void setDuration(double duration) {
		this.duration = duration;
	}
	
	@Override
	public String toString() {
		return "Song [songId=" + songId + ", title=" + title + ", artist=" + artist + ", duration=" + duration + " mins]";
	}
}



