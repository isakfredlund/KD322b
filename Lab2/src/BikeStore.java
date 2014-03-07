import java.util.ArrayList;

public class BikeStore {
	// private String allBikes;
	// private String newBikes;
/** Does an array for the bikes*/
	
	ArrayList<Bike> bikes = new ArrayList<Bike>();

	public String getAllBikes() {
		
		/** does a for-loop for size, price, color*/
	
		String s = "";
		for (Bike bike1 : bikes) {
			

			s = s + "The color of the bike " + bike1.getColor()
					+ "\t the size of the bike is" + bike1.getSize()
					+ "\t the price of the bike is" + bike1.getPrice() + "\n";
		}
		return s;

	}
/** adds the values for size, price, color*/
	public void addBike(String farg, int storlek, int pris) {
		bikes.add(new Bike(farg, storlek, pris));
	}
}