package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc {
	private String artist;
	private ArrayList<Track> tracks;
	
	//getter for artist
	public String getArtist() {
		return artist;
	}
	
	//Constructor
	public CompactDisc(int length, String director, String artist, ArrayList<Track> tracks) {
		super(length, director);
		this.artist = artist;
		this.tracks = tracks;
	}
	
	//addTrack
	public void addTrack(Track track) {
		if(tracks.contains(track)) {
			System.out.println(track.getTitle() +" already exist in the CD");
		}
		tracks.add(track);
		System.out.println("Track " + track.getTitle() + " added sucessfully!");
	}
	
	//removeTrack
	public void removeTrack(Track track) {
		if(tracks.contains(track)) {
			System.out.println("Track " + track.getTitle()  + " remove successfully!");
			tracks.remove(track);
		}
		System.out.println("Track not found!");
	}
	
	//getLength method
	public int totalLength() {
		int total = 0;
		for(Track track : tracks) {
			total += track.getLength();
		}
		return total;
		
		
	}

	public CompactDisc() {
		// TODO Auto-generated constructor stub
	}

	

	

}
