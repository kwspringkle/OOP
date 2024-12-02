package hust.soict.dsai.aims.cart;

import java.util.ArrayList;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
    
    public float totalCost() {
        float sum = 0.00f;
        for(Media itemOrdered : itemsOrdered) {
        	sum += itemOrdered.getCost();
        }
        return sum;
    }
    
    //Print the list of ordered items, price and total price
    public void printCart() {
    	System.out.println("***********************CART***********************");
    	System.out.println("Ordered Items:");
    	float totalcost = 0;
    	for(Media itemOrdered : itemsOrdered){
    		int i = 0;
    		System.out.printf("%d. %s\n",itemOrdered.getId(),itemOrdered);
    		totalcost += itemOrdered.getCost();
    	}
    	System.out.println(String.format("Total cost: %.2f", totalcost));
    	System.out.println("*************************************************** ");
    }
    //Search for DVDs in the cart by ID
    public Media searchByID(int id) {
		 for(Media itemOrdered : itemsOrdered) {
			 if(itemOrdered.getId() == id) {
				 System.out.println("DVD found:");
				 System.out.println(itemOrdered);
				 return itemOrdered;
			 }
		 }
		 
		 System.out.println("No match is found!");
		 return null;
	 }
    
    //Search for DVDs by title 
    public Media searchByTitle(String title) {
    	for(Media itemOrdered : itemsOrdered) {
			 if(itemOrdered.getTitle() == title) {
				 System.out.println("DVD found:");
				 System.out.println(itemOrdered);
				 return itemOrdered;
			 }
		 }
		 
		 System.out.println("No match is found!");
		 return null;
    }
    
    
    //AddMedia
    public void addMedia(Media media) {
    	if(itemsOrdered.size() > MAX_NUMBERS_ORDERED) {
    		System.out.println("The cart is full!");
    	}
    	if(itemsOrdered.contains(media)) {
    		System.out.println(media.getTitle() + " already exists!");
    		return;
    	}
    	itemsOrdered.add(media);
    	 System.out.println(media.getTitle() + " has been added");
    }
    
    //removeMedia
    public void removeMedia(Media media) {
    	if(!itemsOrdered.contains(media)) {
    		System.out.println(media.getTitle() + " is not found");
    	}
    	itemsOrdered.remove(media);
    	System.out.println(media.getTitle() + " is removed successfully");
    }
}

