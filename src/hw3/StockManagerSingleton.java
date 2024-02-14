package hw3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class StockManagerSingleton {
	private final static String FilePath="files/inventoryGiven.csv";



//update price, return false if fail
	public boolean updateItemPrice(MediaProduct product, double newPrice) {
	
	}
	
	//add new item to inventory
	public boolean addItem(MediaProduct product) {
		
	}
	
	public boolean removeItem(MediaProduct product) {
		//remove given product from inventory
	}
	
	public boolean saveStock() {
		
	}
	
	public ArrayList<MediaProduct> getMediaProductBelowPrice(int maxPrice) {
			//gets media products that are below given price
	}
	
	public void printListOfMediaProduct(ArrayList<MediaProduct> productList) {
			//print array list
	}
	
	
}
