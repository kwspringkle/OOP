package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Media implements Playable{
	private String director;
	private int length;
	
	
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title,category,cost);
		this.director = director;
		this.length = length;
		
		
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super(title,category,cost);
		this.director = director;
		
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super(title,category,cost);
	}
	
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public String toString() {
        return "DVD - " + getTitle() + " - " + getCategory() + " - Director: " + getDirector() +
                " - Length: " + getLength() + " mins - Cost: $" + getCost();
    }
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());

	}
}
