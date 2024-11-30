package hust.soict.dsai.aims.media;

import java.util.*;

public class Book extends Media {
	private List<String> authors = new ArrayList<String>();
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	//addAuthor
	public void addAuthor(String authorName) {
		for(String author : authors) {
			if(author == authorName) {
				System.out.println("This author already exist!");
				return;
			}
		}
		authors.add(authorName);
		System.out.println("Author was added sucessfully!");
	}
	
	//removeAuthor
	public void removeAuthor(String authorName) {
		for(String author : authors) {
			if(author == authorName) {
				authors.remove(authorName);
				System.out.println("Author was removed sucessfully!");
			}
		}
		System.out.println("Author's name not found!");
	}
	
	
	
	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}

	

}
