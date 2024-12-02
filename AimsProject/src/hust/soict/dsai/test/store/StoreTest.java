package hust.soict.dsai.test.store;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class StoreTest {
	  public static void main(String[] args) {
	        Store store = new Store();
	        
	        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Jurassic Park", "Adventure", "Steven Spielberg", 127, 22.99f);
	        DigitalVideoDisc dvd2 = new DigitalVideoDisc("The Matrix", "Science Fiction", "Wachowski Sisters", 136, 25.99f);
	            
	        // Test adding DVDs
	        store.addMedia(dvd1);
	        store.addMedia(dvd2);
	        
	        // Test removing DVDs
	        store.removeMedia(dvd1);
	        store.removeMedia(dvd1);  
	    }
}
