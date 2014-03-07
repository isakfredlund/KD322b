
public class Main {
	

	public static void main(String[] args) {
		///**MyBikes**///
		Bike bike1 = new Bike("Red",20,900);
		Bike bike2 = new Bike("Yellow",28,450);
		Bike bike3 = new Bike("Black",19,0 );
		Bike bike4 = new Bike("Green",20, 9000 );
		Bike bike5 = new Bike("Purple",20, 8000 );
		Bike bike6 = new Bike("Black",15, 6000 );
		Bike bike7 = new Bike("Pink",28, 500 );
		Bike bike8 = new Bike("Silver",20, 1000 );
		Bike bike9 = new Bike("Orange",12, 25000 );
		Bike bike10 = new Bike("White",20, 3000 );

		
		Bike [] bikeArray = new Bike [10];
		
		bikeArray [0] = bike1;
		bikeArray [1] = bike2;
		bikeArray [2] = bike3;
		bikeArray [3] = bike4;
		bikeArray [4] = bike5;
		bikeArray [5] = bike6;
		bikeArray [6] = bike7;
		bikeArray [7] = bike8;
		bikeArray [8] = bike9;
		bikeArray [9] = bike10;
		
		for(int i = 0;i<bikeArray.length;i++){
			int a = i+1;
			a=a+1;
		
			System.out.println("Cykelnummer:" + a + " Farg:" + bikeArray[i].getColor() + 
					", storlek " + bikeArray[i].getSize() + ", Pris:" + bikeArray[i].getPrice());
			
		}
		
		
				
			
			
	}
	}
