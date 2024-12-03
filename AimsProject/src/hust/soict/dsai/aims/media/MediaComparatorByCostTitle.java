package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media> {

	@Override
	public int compare(Media o1, Media o2) {
		int costComparision = Float.compare(o1.getCost(),o2.getCost());
		if (costComparision != 0) {
            return costComparision;
        }
		return o1.getTitle().compareToIgnoreCase(o2.getTitle());
	}

}


