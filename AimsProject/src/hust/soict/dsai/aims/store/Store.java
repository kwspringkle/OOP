package hust.soict.dsai.aims.store;

import java.util.ArrayList;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class Store {
    private static final int MAX_ITEMS = 100;  
    private ArrayList<Media> itemsinStore = new ArrayList<Media>();

    public void addMedia(Media media) {
        if (itemsinStore.size() >= MAX_ITEMS) {
            System.out.println("The store is full!");
            return;
        }
        if(itemsinStore.contains(media)) {
    		System.out.println(media.getTitle() + " already exists!");
    		return;
    	}
        itemsinStore.add(media);
        System.out.println(media.getTitle() + " is added successfully to the store!");
    }

    public void removeMedia(Media media) {
    	if(!itemsinStore.contains(media)) {
    		System.out.println(media.getTitle() + " is not in the store");
    		return;
    	}
    	itemsinStore.remove(media);
    	System.out.println(media.getTitle() + " is removed successfully");
    }
    
  //Search for DVDs in the cart by ID
    public Media searchByID(int id) {
		 for(Media iteminStore : itemsinStore) {
			 if(iteminStore.getId() == id) {
				 System.out.println("Item found:");
				 System.out.println(iteminStore);
				 return iteminStore;
			 }
		 }
		 
		 System.out.println("No match is found!");
		 return null;
	 }
    
    //Search for DVDs by title 
    public Media searchByTitle(String title) {
    	for(Media iteminStore : itemsinStore) {
			 if(iteminStore.getTitle() == title) {
				 System.out.println("DVD found:");
				 System.out.println(itemsinStore);
				 return iteminStore;
			 }
		 }
		 
		 System.out.println("No match is found!");
		 return null;
    }
    
    public void printStore() {
        System.out.println("***********************STORE***********************");
        int i = 0; 

        for (Media itemInStore : itemsinStore) {
            i++; 
            System.out.printf("%d. %s\n", i, itemInStore); 
        }

        System.out.println("*************************************************** ");
    }

}