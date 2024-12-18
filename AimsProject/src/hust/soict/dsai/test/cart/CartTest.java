package hust.soict.dsai.test.cart;
import hust.soict.dsai.aims.media.*;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.media.*;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import java.util.ArrayList;

public class CartTest {
	public static void main(String[] args) {
		Cart cart = new Cart();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation", "Roger Allers", 87, 19.95f);
		cart.addMedia(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star wars","Science Fiction", "George Lucas", 87, 24.95f);
		cart.addMedia(dvd2);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		cart.addMedia(dvd3);
		
		//Test print method
		cart.printCart();
		//test search method
		/*
		cart.searchByID(0);
		cart.searchByID(2);
		cart.searchByTitle("Aladin");
		cart.searchByTitle("Sofia the first");
		*/
		System.out.println(dvd1.equals(dvd1));
		String unrelatedObj = "The Lion King";
		System.out.println(dvd1.equals(unrelatedObj));
		
		
		List<Media> mediae = new ArrayList<Media>();
		
		mediae.add(dvd1);
		mediae.add(dvd2);
		mediae.add(dvd3);
		
		for(Media m : mediae) {
			System.out.println(m.toString());
		}
		
	}
}
