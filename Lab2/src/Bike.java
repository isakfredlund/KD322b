
public class Bike {

	private String color;
	private int price;
	private int size;
	
	private static int nbrOfBikes;
	
	
	public Bike(String farg, int storlek){
		color = farg;
		size = storlek;	
		
		
	}
	
	/** Visar en cykel med varden begransade med hjalp av vardena i Constants*/
	public Bike(String farg, int storlek, int pris){
		
		if (storlek > Constants.MIN_SIZE){
			   this.size = storlek;
			   }else{
				   size = Constants.MIN_SIZE;
			   }
		 if (pris > Constants.MIN_PRICE){
			   this.price = pris;
			   }else{
				   price = Constants.MIN_PRICE;
			   }
		 
		 this.color = farg;
		
		nbrOfBikes = nbrOfBikes + 1; 
	}
		
		
	/**Hamtar och returnerar farger fran Constants*/
	public String getColor(){
		return color;
	}
	/**Hamtar och returnerar storleken frn Constants*/
	public int getSize(){
		return size;
	}
	/**Hamtar och returnerar pris fran Constants*/
	public int getPrice(){
		return price;
	}
	
	public void setPrice(int pris){
		
	}
	/**Hamtar antalet cyklar fran Constants*/
	public int getNumberOfBikes(){
		return nbrOfBikes;
	}
	
}