
public class Human {
	
	private String name;
	private Dog dog;
	private String Info = "";

	//private String Info2 = "";
	public Human (String s){
		name = s;
		
	}
	
	public String getName(){
		
		return name;
	}
	
	public void buyDog(Dog d) {
		dog = d;
		//return dog;
		
		
	}
	public String getInfo(){
		
		
		
		if(dog == null){
		Info = ("Dogless");
		return Info;
		}else{
			Info = ("Has a dog");
			return Info;
		
		}
		}

	public void buyDog(java.lang.String text) {
		// TODO Auto-generated method stub
		
	}
	
}
	

