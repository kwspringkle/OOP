package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media> {

	@Override
	public int compare(Media o1, Media o2) {
		int titleComparision = o1.getTitle().compareToIgnoreCase(o2.getTitle());
		if(titleComparision != 0) {
			return titleComparision;
		}
		return Float.compare(o1.getCost(),o2.getCost());
	}

}


