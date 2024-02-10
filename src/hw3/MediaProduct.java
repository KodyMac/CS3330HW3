package hw3;

public class MediaProduct {
		//attributes
	protected String title;
	protected double price;
	protected int year;
	protected Genre genre;
	
		//Constructor
	public MediaProduct(String title, double price, int year, Genre genre) {
		this.title=title;
		this.price=price;
		this.year=year;
		this.genre=genre;
	}
	
	
	
	
		//getters and setters
	protected String getTitle() {
		return title;
	}
	
	protected void setTitle(String title) {
		this.title=title;
	}
	
	protected double getPrice() {
		return price;
	}
	
	protected void setPrice(double price) {
		this.price=price;
	}
	
	protected int getYear() {
		return year;
	}
	
	protected void setYear(int year) {
		this.year=year;
	}
	
	protected Genre getGenre() {
		return genre;
	}
	
	protected void setGenre(Genre genre) {
		this.genre=genre;
	}
	
}
