
public abstract class Animal {

	private String Latin;
	
	public Animal(String Latin){
		
		Latin(Latin);
	}
	public String getLatin(){
		return Latin;
		
	}

	public void Latin(String Latin){
		this.Latin = Latin;
	}
	abstract String getInfo();
}
