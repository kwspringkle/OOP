package aims.disc;

public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	
	//New
	private static int nbDigitalVideoDiscs = 0;
	private int id;
	
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		
		//New
		nbDigitalVideoDiscs++;
		this.id = nbDigitalVideoDiscs;
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
		
		//New
		nbDigitalVideoDiscs++;
		this.id = nbDigitalVideoDiscs;
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		
		//New
		nbDigitalVideoDiscs++;
		this.id = nbDigitalVideoDiscs;
	}
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
		
		//New
		nbDigitalVideoDiscs++;
		this.id = nbDigitalVideoDiscs;
	}
	
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}
	
	public String setTitle(String title) {
		this.title = title;
		return title;
	}
	
	 public int getId() {
	    return id; 
	 }
	 
	 public String toString(){
		 return String.format("DVD - %s - %s - %s - %d: %.2f $", 
				 title,
				 category,
				 director,
				 length,
				 cost);
	 }
	 
}
