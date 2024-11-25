package test.store;

import aims.disc.DigitalVideoDisc;
import aims.store.Store;

public class StoreTest {
	  public static void main(String[] args) {
	        Store store = new Store();
	        
	        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Jurassic Park", "Adventure", "Steven Spielberg", 127, 22.99f);
	        DigitalVideoDisc dvd2 = new DigitalVideoDisc("The Matrix", "Science Fiction", "Wachowski Sisters", 136, 25.99f);
	            
	        // Test adding DVDs
	        store.addDVD(dvd1);
	        store.addDVD(dvd2);
	        
	        // Test removing DVDs
	        store.removeDVD(dvd1);
	        store.removeDVD(dvd1);  
	    }
}
