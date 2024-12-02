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
}