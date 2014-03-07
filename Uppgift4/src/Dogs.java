
public class Dogs extends Mammal{
	
	private Boolean Stupid;
	
	public Dogs(String Latin, int nursingTime,Boolean Stupid){
		super(Latin,nursingTime);
		this.Stupid = Stupid;
		}
	public Boolean getStupid(){
		return Stupid;
	}
	
	public void setStupid(boolean Stupid){
		this.Stupid = Stupid;
	}

	@Override
	public String getInfo() {
		
		
		String s;
		
		if(Stupid){
			s = ""; // this is were s gets an empty String
		
		}else{
			s = "not";
		}
		
		s = "The dog \""+this.getLatin()+"\" nurses for "+super.getnursingTime()+"months and is "+ s +" small brain. \n";
		
		// TODO Auto-generated method stub
		return s;
	
	}
	}

