
public abstract class Mammal extends Animal {

	private int nursingTime;
	
	public Mammal(String Latin, int nursingTime){
		
		super (Latin);
		this.nursingTime = nursingTime; // Get och set for nursingtime
		
	}
	public int getnursingTime(){
		return nursingTime;
	}
	public void setnursingTime(int nursingTime){
		this.nursingTime = nursingTime;
	}
}
