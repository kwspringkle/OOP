package hust.soict.dsai.aims.media;

public class Disc extends Media {
	private int length;
	private String director;
	
	//getters
	public int getLength() {
		return length;
	}

	public String getDirector() {
		return director;
	}

	//Constructor
	public Disc(int length, String director) {
		super();
		this.length = length;
		this.director = director;
	}

	public Disc() {
		// TODO Auto-generated constructor stub
	}

}
