package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable {
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<Track>();
	
	//getter for artist
	public String getArtist() {
		return artist;
	}
	
	//Constructor
	public CompactDisc(String title, String category, float cost, String artist, ArrayList<Track> tracks) {
		super(title, category, cost);
		this.artist = artist;
		this.tracks = tracks;
	}
	
	public CompactDisc(String title, String category, float cost, int length, String director) {
		super(title, category, cost, length, director);
		// TODO Auto-generated constructor stub
	}

	public CompactDisc(String title, String category, float cost) {
		super(title, category, cost);
		// TODO Auto-generated constructor stub
	}
	
	public CompactDisc(String title, String category, String artist, float cost) {
		super(title, category, cost);
		this.artist = artist;
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

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
		
		for(Track track : tracks) {
			track.play();
		}
	}
	

	@Override
	public String toString() {
        return "CD - " + getTitle() + " - " + getCategory() + " - Director: " + getDirector() +
                " - Length: " + getLength() + " mins - Cost: $" + getCost();
    }

	

	

}
