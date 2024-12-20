package hust.soict.dsai.aims.screen;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Track;
import hust.soict.dsai.aims.store.Store;
public class StoreScreen extends JFrame {
	private Store store;
	
	JPanel createNorth() {
		JPanel north = new JPanel();
		north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
		north.add(createMenuBar());
		north.add(createHeader());
		return north;
	}
	
	JMenuBar createMenuBar() {
		JMenu menu = new JMenu("Options");
		
		JMenu smUpdateStore = new JMenu("Update Store");
		smUpdateStore.add(new JMenuItem("Add Book"));
		smUpdateStore.add(new JMenuItem("Add CD"));
		smUpdateStore.add(new JMenuItem("Add DVD"));
		
		menu.add(smUpdateStore);
		menu.add(new JMenuItem("View store"));
		menu.add(new JMenuItem("View cart"));
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
		menuBar.add(menu);
		
		return menuBar;
		
	}
	
	JPanel createHeader() {
		JPanel header = new JPanel();
		header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));
		
		JLabel title = new JLabel("AIMS");
		title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
		JButton cart = new JButton("View cart");
		cart.setPreferredSize(new Dimension(100,50));
		cart.setMaximumSize(new Dimension(100,50));
		
		header.add(Box.createRigidArea(new Dimension(10,10)));
		header.add(title);
		header.add(Box.createHorizontalGlue());
		header.add(cart);
		header.add(Box.createRigidArea(new Dimension(10,10)));
		
		return header;
	}
	
	
	public JPanel createCenter() {
	    JPanel center = new JPanel();
	    center.setLayout(new GridLayout(3, 3, 2, 2));

	    ArrayList<Media> mediaInStore = store.getItemsinStore();
	    
	    Cart cart = new Cart();  // Khởi tạo giỏ hàng (nếu chưa có)

	    for(int i = 0; i < 9 && i < mediaInStore.size(); i++) {
	        Media media = mediaInStore.get(i);
	        MediaStore cell = new MediaStore(media, cart);  // Truyền cart vào MediaStore
	        center.add(cell);
	    }

	    return center;
	}
	
	public StoreScreen(Store store) {
		this.store = store;
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());
		
		cp.add(createNorth(), BorderLayout.NORTH);
		cp.add(createCenter(), BorderLayout.CENTER);
		
		setVisible(true);
		setTitle("Store");
		setSize(1024,768);
	}
	
	public static void init(Store store) {
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("Jurassic Park", "Adventure", "Steven Spielberg", 127, 22.99f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("The Matrix", "Science Fiction", "Wachowski Sisters", 136, 25.99f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        store.addMedia(dvd1);
        store.addMedia(dvd2);
        store.addMedia(dvd3);
        
        Book book1 = new Book("Sherlock Holmes", "Detective", 20.00f);
        Book book2 = new Book("To Kill a Mockingbird", "Classic", 15.50f);
        Book book3 = new Book("The Great Gatsby", "Fiction", 18.75f);
        store.addMedia(book1);
        store.addMedia(book2);
        store.addMedia(book3);
        
        CompactDisc cd1 = new CompactDisc("Fearless (Taylor’s Version)", "Music", "Taylor Swift", 1200.50f);
        Track track1CD1 = new Track("Love Story", 3 * 60 + 55);
        Track track2CD1 = new Track("You Belong With Me", 3 * 60 + 51);
        Track track3CD1 = new Track("White Horse", 3 * 60 + 54);
        cd1.addTrack(track1CD1);
        cd1.addTrack(track2CD1);
        cd1.addTrack(track3CD1);

        CompactDisc cd2 = new CompactDisc("Divide", "Music", "Ed Sheeran", 1800.75f);
        Track track1CD2 = new Track("Shape of You", 3 * 60 + 53);
        Track track2CD2 = new Track("Castle on the Hill", 4 * 60 + 21);
        Track track3CD2 = new Track("Perfect", 4 * 60 + 23);
        cd2.addTrack(track1CD2);
        cd2.addTrack(track2CD2);
        cd2.addTrack(track3CD2);

        CompactDisc cd3 = new CompactDisc("Chromatica", "Music", "Lady Gaga", 1400.99f);
        Track track1CD3 = new Track("Rain On Me", 3 * 60 + 2);
        Track track2CD3 = new Track("911", 2 * 60 + 53);
        Track track3CD3 = new Track("Stupid Love", 3 * 60 + 37);
        cd3.addTrack(track1CD3);
        cd3.addTrack(track2CD3);
        cd3.addTrack(track3CD3);

        store.addMedia(cd1);
        store.addMedia(cd2);
        store.addMedia(cd3);

        
	}
	public static void main(String[] args) {
		Store store = new Store();
		init(store);
		new StoreScreen(store);
	}
}
