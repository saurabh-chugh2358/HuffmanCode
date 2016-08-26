import java.util.AbstractList;
public class SimpleDotComTestDrive {
	
	public static void main(String[] args) {
		int noOfGuesses = 0;
		
		SimpleDotCom dot = new SimpleDotCom();
		int [] locations = new int[3];
		
		GameHelper helper = new GameHelper();
		
		locations[0] = (int) (Math.random()*4);
		locations[1] = locations[0] +1;
		locations[2] = locations[1] +1;
		dot.setLocationCells(locations);
		
		//String userGuess = "2";
		
		for(boolean alive = true; alive == true;) {
			//dot.checkYourself(userGuess);
			String userGuess = helper.getUserInput("enter a number: ");
			if (dot.checkYourself(userGuess).equals("kill")){
				noOfGuesses++ ;
				System.out.println("Total no. of guess:" + noOfGuesses);
				alive = false;
			}
			else{
				noOfGuesses++ ;
			}
		}
	}

}


class SimpleDotCom{
	int [] locationCells = new int[3];
	private int numOfHits = 0;
	
	public String checkYourself (String uGuess){
		int guess = Integer.parseInt(uGuess);
		String result = "miss";
		
		for (int cell =0; cell < locationCells.length;cell++){
		//for (int cell : locationCells){
			//if (guess == cell){
			if (guess == locationCells[cell]){
				locationCells[cell] = -1;
				//cell = 0;
				result = "hit";
				numOfHits += 1;
				break;
			}
		}
		
		if (numOfHits == locationCells.length) {
			result = "kill";
		}
		
		System.out.println(result);
		
		return result;
		
	}
	
	public void setLocationCells(int [] locs){
		locationCells = locs;
	}
}


