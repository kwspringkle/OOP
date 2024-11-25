package aims;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered == MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is full");
            return;
        }
        

        itemsOrdered[qtyOrdered++] = disc;
        System.out.println("The DVD has been added");
    }
    
    public void addDigitalVideoDisc(DigitalVideoDisc... dvdList) {	
    	//arbitrary number of arguments instead of array parameter
    	if (qtyOrdered == MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is full");
            return;
        }
    	
    	int numberOfDVDs = dvdList.length;
    	
    	if (qtyOrdered + numberOfDVDs > MAX_NUMBERS_ORDERED) {
            System.out.println("Cannot add all DVDs. Cart would exceed maximum capacity.");
            return;
        }
    	
    	for(DigitalVideoDisc dvd: dvdList) {
    		itemsOrdered[qtyOrdered++] = dvd;
    	}
    	
    	System.out.println("List of DVDs has been added");
    	
    }
    
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
    	if (qtyOrdered == MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is full");
            return;
        }
    	if (qtyOrdered + 2 > MAX_NUMBERS_ORDERED) {
            System.out.println("Cannot add all DVDs. Cart would exceed maximum capacity.");
            return;
        }
    	itemsOrdered[qtyOrdered++] = dvd1;
    	itemsOrdered[qtyOrdered++] = dvd2;
    	
    	System.out.println("2 DVDs has been added");
    }
    


    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered == 0) {
            System.out.println("Nothing to remove");
            return;
        }

        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] == disc) {
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                itemsOrdered[qtyOrdered - 1] = null;
                qtyOrdered--;
                System.out.println("The disc is removed successfully");
                return;
            }
        }

        System.out.println("The disc was not found in the cart");
    }

    public float totalCost() {
        float sum = 0.00f;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] != null) {
                sum += itemsOrdered[i].getCost();
            }
        }
        return sum;
    }
    
    //Print the list of ordered items, price and total price
    public void printCart() {
    	System.out.println("***********************CART***********************");
    	System.out.println("Ordered Items:");
    	float totalcost = 0;
    	for(int i = 0; i < qtyOrdered; i++) {
    		System.out.printf("%d. %s\n",i+1,itemsOrdered[i].toString());
    		totalcost += itemsOrdered[i].getCost();
    	}
    	System.out.println(String.format("Total cost: %.2f", totalcost));
    	System.out.println("*************************************************** ");
    }
    //Search for DVDs in the cart by ID
    public DigitalVideoDisc searchByID(int id) {
		 for(int i = 0; i < qtyOrdered; i++) {
			 if(itemsOrdered[i].getId() == id) {
				 System.out.println("DVD found:");
				 System.out.println(itemsOrdered[i].toString());
				 return itemsOrdered[i];
			 }
		 }
		 
		 System.out.println("No match is found!");
		 return null;
	 }
    
    //Search for DVDs by title 
    public DigitalVideoDisc searchByTitle(String title) {
    	for(int i = 0; i < qtyOrdered; i++) {
			 if(itemsOrdered[i].getTitle() == title) {
				 System.out.println("DVD found:");
				 System.out.println(itemsOrdered[i].toString());
				 return itemsOrdered[i];
			 }
		 }
		 
		 System.out.println("No match is found!");
		 return null;
    }
    
}

