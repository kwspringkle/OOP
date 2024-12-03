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
	public Disc(String title, String category, float cost) {
		super(title, category, cost);
	}
	

	public Disc(String title, String category, float cost, int length, String director) {
		super(title, category, cost);
		this.length = length;
		this.director = director;
	}

	public Disc() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
        return "Disc - " + getTitle() + " - " + getCategory() + " - Director: " + getDirector() +
                " - Length: " + getLength() + " mins - Cost: $" + getCost();
    }

}
