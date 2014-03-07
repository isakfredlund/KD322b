
public class Cats extends Mammal{
	
	private int Lives;
	
	public Cats(String Latin, int nursingTime, int Lives){
		super(Latin,nursingTime);
		this.Lives = Lives;
		
		}
	public int getLives(){
		return Lives;
	}

	@Override
	public String getInfo() {
		String s;
		s = "The cat \""+this.getLatin()+"\" nurses for "+super.getnursingTime()+"and has "+ Lives +"lives \n";
		
		// TODO Auto-generated method stub
		return s;
	}

	
	}

