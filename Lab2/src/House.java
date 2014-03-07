public class House{						//Instansvariabler//	
private int year;
private int size;
private static int nbrOfHouses; 		//Klassvariabel//
public static final int MIN_SIZE =10; 	// final skrivs ut for att man inte ska kunna andra vardet nar applikationen skrivs ut
public House(int _year,int _size){		//Konstruktor//
//diverse kod
	year = _year;
	if (_size > MIN_SIZE){
	size = _size;
	}else{
		size = MIN_SIZE;
	}
	nbrOfHouses = nbrOfHouses + 1 ; 
}
public static int getNbrHouses(){ 		//Klassmetod
	return nbrOfHouses;
}
public int getYear(){					//Instansmetod			
//diverse kod 
	
	return year;
}
public int getSize(){ 
	//diverse kod
	
	return size;
	
} 
}
