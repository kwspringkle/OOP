package hust.soict.dsai.aims.media;

import java.util.Comparator;

public abstract class Media {
	public static final Comparator<Media> COMPARE_BY_TITLE_COST 
	= new MediaComparatorByTitleCost();
	public static final Comparator<Media> COMPARE_BY_COST_TITLE 
	= new MediaComparatorByCostTitle();
	
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

	public Media(String title, String category) {
		super();
		this.title = title;
		this.category = category;
	}

	public Media(String title) {
		super();
		this.title = title;
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
	
	@Override
    public boolean equals(Object object) {
        if (object instanceof Media) {
            Media other = (Media) object;
            return this.title.equalsIgnoreCase(other.getTitle());
        }
        return false;
    }

	public Media() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
        return "Media - " + getTitle() + " - " + getCategory()  + " - Cost: $" + getCost();
    }


}
