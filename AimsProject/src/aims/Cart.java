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
}
