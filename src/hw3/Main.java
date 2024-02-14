package hw3;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		
				   String fileName = "files/inventoryGiven.csv";
				   StockManagerSingleton initialize = new StockManagerSingleton();
				   
				   // Read student data from a file and initialize Product objects.
				   ArrayList<MediaProduct> products = initialize.readFromFile(fileName);
				   
				   initialize.printListOfMediaProduct(products);
			}
		}

	}

}
