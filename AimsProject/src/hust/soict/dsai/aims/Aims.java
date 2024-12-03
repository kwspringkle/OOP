package hust.soict.dsai.aims;
import java.util.*;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Disc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.MediaComparatorByCostTitle;
import hust.soict.dsai.aims.media.MediaComparatorByTitleCost;
import hust.soict.dsai.aims.media.Playable;
import hust.soict.dsai.aims.store.Store;



public class Aims {
	//Main
	public static void showMenu() {
		System.out.println("AIMS: ");
		System.out.println("-----------------------------------------");
		System.out.println("1.View store");
		System.out.println("2.Update store");
		System.out.println("3.See current cart");
		System.out.println("0.Exit");
		System.out.println("-----------------------------------------");
		System.out.println("Please choose a number: 0-1-2-3");
		
	}

	public static void handleShowMenu(Scanner scanner, Store store, Cart cart) {
		while(true) {
			showMenu();
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			switch(choice) {
			case 1:
				handleStoreMenu(scanner, store, cart);
				break;
			case 2:
				handleUpdateStore(scanner,store, cart);
				break;
			case 3:
				handleCartMenu(scanner,store,cart);
				break;
			case 0:
				return;
			default:
                System.out.println("Invalid choice. Please try again.");
				
			}
		}
	}
	
	//Option 1
	public static void storeMenu() {
		System.out.println("Options: ");
		System.out.println("-----------------------------------------");
		System.out.println("1.See a media's details");
		System.out.println("2.Add a media to cart");
		System.out.println("3.Play a media");
		System.out.println("4.See current cart");
		System.out.println("0.Back");
		System.out.println("-----------------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
		
	}
	
	public static void handleStoreMenu(Scanner scanner, Store store, Cart cart) {
		while(true) {
			storeMenu();
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			switch(choice) {
			case 1:
				handleMediaDetailsMenu(scanner, store, cart);
				break;
			case 2:
				addMediatoCart(scanner,cart,store);
				break;
			case 3:
				playMedia(scanner, cart, store);
				break;
			case 4:
				handleCartMenu(scanner,store,cart);
				break;
			case 0:
				return;
			default:
                System.out.println("Invalid choice. Please try again.");
			}
			
			
		}
			 
	}
	
	//See media details
	public static void mediaDetailsMenu() {
		System.out.println("Options: ");
		System.out.println("-----------------------------------------");
		System.out.println("1.Add to cart");
		System.out.println("2.Play");
		System.out.println("0.Back");
		System.out.println("-----------------------------------------");
		System.out.println("Please choose a number: 0-1-2");
		
	}
	
	public static void handleMediaDetailsMenu(Scanner scanner, Store store, Cart cart) {
		while(true) {
			mediaDetailsMenu();
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			switch(choice) {
			case 1:
				addMediatoCart(scanner, cart, store);
				break;
			case 2:
				playMedia(scanner, cart, store);
				break;
			case 0:
				return;
			default:
                System.out.println("Invalid choice. Please try again.");
			}
			
			
		}
			 
	}
	
	//Add media to cart
		public static void addMediatoCart(Scanner scanner, Cart cart, Store store) {
			 System.out.println("Enter the title of the media to add to the cart:");
			 String title = scanner.nextLine();
			 
			 Media media = store.searchByTitle(title);
			 //Nếu tìm thấy media trong store --> media khác null
			  if (media != null) {
			        cart.addMedia(media); 
			        System.out.println("Media " + media.getTitle() + " has been added to the cart.");
			        System.out.println("Number of items in cart: " + cart.getNumItemsInCart()); // Display number of items in the cart
			    } else {
			    	//nếu media = null
			        System.out.println("Media not found.");
			    }
		}
		
		public static void removeMediafromCart(Scanner scanner, Cart cart) {
			 System.out.println("Enter the title of the media to remove from the cart:");
			 String title = scanner.nextLine();
			 
			 Media media = cart.searchByTitle(title);
			 //Nếu tìm thấy media trong cart
			  if (media != null) {
			        cart.removeMedia(media); 
			        System.out.println("Media " + media.getTitle() + " has been removed from the cart.");
			    } else {
			        System.out.println("Media " + title + " not found.");
			    }
		}
		
		
		public static void removeMediafromStore(Scanner scanner, Store store) {
			 System.out.println("Enter the title of the media to remove from the store:");
			 String title = scanner.nextLine();
			 
			 Media media = store.searchByTitle(title);
			 //Nếu tìm thấy media trong store
			  if (media != null) {
			        store.removeMedia(media); 
			        System.out.println("Media " + media.getTitle() + " has been removed from the store.");
			    } else {
			        System.out.println("Media " + title + " not found.");
			    }
		}
		
		//Play a media
		public static void playMedia(Scanner scanner, Cart cart, Store store) {
			System.out.println("Enter the title of the media to play:");
			String title = scanner.nextLine();
			 
			 Media media = store.searchByTitle(title);
			 if(media != null) {
				 if(media instanceof Playable) {
					 ((Playable) media).play();
				 } else {
					 System.out.println("Cannot play");
				 }
			 }
			 System.out.println("Media not found");
			
		}
		
	
	//Option 2
	public static void updateStore() {
		System.out.println("Options: ");
		System.out.println("-----------------------------------------");
		System.out.println("1.Add a media");
		System.out.println("2.Remove a media");
		System.out.println("0.Back");
		System.out.println("-----------------------------------------");
		System.out.println("Please choose a number: 0-1-2");
		
	}
	
	public static void handleUpdateStore(Scanner scanner, Store store, Cart cart) {
		while(true) {
			updateStore();
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch(choice) {
			case 1:
				System.out.println("Enter media title: ");
				String title = scanner.nextLine();
				System.out.println("Enter media type:");
				String type = scanner.nextLine();
				if(type.equals("Book")) {
					System.out.print("Enter category, cost: ");
                    String category = scanner.nextLine();
                    float cost = scanner.nextFloat();
                    Book book = new Book(title,category, cost);
                    store.addMedia(book);
				} else if(type.equals("CD")) {
					System.out.print("Enter category, cost: ");
                    String category = scanner.nextLine();
                    float cost = scanner.nextFloat();
                    CompactDisc cd = new CompactDisc(title,category, cost);
                    store.addMedia(cd);
				} else if(type.equals("DVD")) {
					System.out.print("Enter category, cost: ");
                    String category = scanner.nextLine();
                    float cost = scanner.nextFloat();
                    DigitalVideoDisc dvd = new DigitalVideoDisc(title,category, cost);
                    store.addMedia(dvd);
				}
				break;
			case 2:
				removeMediafromStore(scanner, store);
				break;
			case 0:
				return;
			default:
                System.out.println("Invalid choice. Please try again.");
				
			}
		}
	}
	
	//Option 3: see current cart
	public static void cartMenu() {
		System.out.println("Options: ");
		System.out.println("-----------------------------------------");
		System.out.println("1.Filter medias in cart");
		System.out.println("2.Sort medias in cart");
		System.out.println("3.Remove media from cart");
		System.out.println("4.Play a media");
		System.out.println("5.Place order");
		System.out.println("0.Back");
		System.out.println("-----------------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4-5");
	}
	
	public static void handleCartMenu(Scanner scanner, Store store, Cart cart) {
		while(true) {
			cartMenu();
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch(choice) {
			case 1:
				filterMenu(scanner, store, cart);
				break;
			case 2:
				sortCart(scanner, store, cart);
				break;
			case 3:
				removeMediafromCart(scanner, cart);
				break;
			case 4:
				playMedia(scanner, cart, store);
				break;
			case 5:
				placeOrder(cart);
				break;
			case 0:
				return;
			default:
                System.out.println("Invalid choice. Please try again.");
				
				
			}
		}
	}
	
	public static void placeOrder(Cart cart) {
        System.out.println("Order placed successfully! Total Cost: $" + cart.totalCost());
        cart.getItemsOrdered().clear(); 
    }
	
	public static void sortCart(Scanner scanner, Store store, Cart cart) {
		while(true) {
		 System.out.println("Sort by: ");
	        System.out.println("1. Title");
	        System.out.println("2. Cost");
	        int sortChoice = scanner.nextInt();
	        scanner.nextLine();
	        switch (sortChoice) {
	            case 1:
	                Collections.sort(cart.getItemsOrdered(), new MediaComparatorByTitleCost());
	                break;
	            case 2:
	            	Collections.sort(cart.getItemsOrdered(), new MediaComparatorByCostTitle());
	                break;
	            default:
	            	System.out.println("Invalid choice. Please try again.");
	        }
	        cart.printCart();
		}
	}
	public static void filterMenu(Scanner scanner, Store store, Cart cart) {
		while(true) {
		System.out.println("Options: ");
		System.out.println("-----------------------------------------");
		System.out.println("1.Filter by ID");
		System.out.println("2.Filter by title");
		System.out.println("0.Back");
		System.out.println("-----------------------------------------");
		System.out.println("Please choose a number: 0-1-2");
		
		int choice = scanner.nextInt();
		scanner.nextLine();
		switch(choice) {
		case 1:
			int id = scanner.nextInt();
			cart.searchByID(id);
			break;
		case 2:
			String title = scanner.next();
			scanner.nextLine();
			cart.searchByTitle(title);
			break;
		case 0:
			return;
		default: 
			 System.out.println("Invalid choice. Please try again.");
		}
	}
		
	}
	
	public static void filterCartMenu() {
		System.out.println("Options: ");
		System.out.println("-----------------------------------------");
		System.out.println("1.Filter by ID");
		System.out.println("2.Filter by title");
		System.out.println("0.Back");
		System.out.println("-----------------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4-5");
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Store store = new Store();
		Cart cart = new Cart();
		handleShowMenu(scanner, store, cart);
	
		
		
	}
}
