import java.util.ArrayList;

public class DotCom {
	private String dotComName;
	private ArrayList<String> locationCells;
	
	public void setLocationCells (ArrayList<String> locs){
		locationCells = locs;
	}
	
	public DotCom (String dName){
		this.dotComName = dName;
	}
	
	public String checkYourself (String uguess){
		String result = "miss";
		
		int index = locationCells.size() +1;
		index = locationCells.indexOf(uguess);
		if (index >= 0 && index <=  locationCells.size()){
			locationCells.remove(index);
			
			if (locationCells.isEmpty()){
				result = "kill";
				System.out.println("Ouch! you sank " + dotComName + ":(");
			}
			else{
				result = "hit";
			}
		}
		return result;
	}
}
