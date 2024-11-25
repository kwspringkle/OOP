package test.cart;

import aims.cart.Cart;
import aims.disc.DigitalVideoDisc;

public class CartTest {
	public static void main(String[] args) {
		Cart cart = new Cart();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation", "Roger Allers", 87, 19.95f);
		cart.addDigitalVideoDisc(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star wars","Science Fiction", "George Lucas", 87, 24.95f);
		cart.addDigitalVideoDisc(dvd2);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		cart.addDigitalVideoDisc(dvd3);
		
		//Test print method
		cart.printCart();
		//test search method
		cart.searchByID(0);
		cart.searchByID(2);
		cart.searchByTitle("Aladin");
		cart.searchByTitle("Sofia the first");
		
		
	}
}
