package aims.store;

import aims.disc.DigitalVideoDisc;

public class Store {
    private static final int MAX_ITEMS = 100;  
    private DigitalVideoDisc[] itemsinStore;
    private int itemCount = 0;
    
    public Store() {
        itemsinStore = new DigitalVideoDisc[MAX_ITEMS];
    }

    public void addDVD(DigitalVideoDisc dvd) {
        if (itemCount >= MAX_ITEMS) {
            System.out.println("The store is full!");
            return;
        }
        
        itemsinStore[itemCount++] = dvd;
        System.out.println("DVD added successfully to the store!");
    }

    public void removeDVD(DigitalVideoDisc dvd) {
        if (itemCount == 0) {  
            System.out.println("The store is empty!");
            return;
        }
        
        boolean found = false;
        for (int i = 0; i < itemCount; i++) {
            if (itemsinStore[i] == dvd) {
            
                for (int j = i; j < itemCount - 1; j++) {
                    itemsinStore[j] = itemsinStore[j + 1];
                }
                itemsinStore[itemCount - 1] = null;
                itemCount--;
                found = true;
                System.out.println("DVD removed successfully from the store");
                break;
            }
        }

        if (!found) {
            System.out.println("DVD not found in the store");
        }
    }
}