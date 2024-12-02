package hust.soict.dsai.aims.media;

public abstract class Media {
	private int id;
	private String title;
	private String category;
	private float cost;
	private static int nbDigitalVideoDiscs = 0;
	//Getters & setters

	
	public Media(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		nbDigitalVideoDiscs++;
		this.id = nbDigitalVideoDiscs;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public static int getNbDigitalVideoDiscs() {
		return nbDigitalVideoDiscs;
	}

	public static void setNbDigitalVideoDiscs(int nbDigitalVideoDiscs) {
		Media.nbDigitalVideoDiscs = nbDigitalVideoDiscs;
	}

	public Media() {
		// TODO Auto-generated constructor stub
	}


}
