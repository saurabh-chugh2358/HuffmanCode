import java.util.*;
public class DotComBust {
	private GameHelper helper = new GameHelper();
	private int noOfGuesses = 0;
	private ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
	
	private void setUpGame(){
		DotCom one = new DotCom("Pets.com");
		DotCom two = new DotCom("eToys.com");
		DotCom three = new DotCom("Go2.com");
		
		dotComList.add(one);
		dotComList.add(two);
		dotComList.add(three);
		
		System.out.println("Your goal is to sink 3 dot coms: ");
		System.out.println("Pets.com, eToys.com, Go2.com");
		System.out.println("Try to sink all of them in fewer no. of guesses");
		
		for (DotCom dotComToSet : dotComList){
			ArrayList<String> newLocation = helper.placeDotCom(3);
			dotComToSet.setLocationCells(newLocation);
		}
	}
	
	private void startPlaying (){
		while (!dotComList.isEmpty()){
			
			String userGuess = helper.getUserInput("Enter a Guess: ");
			checkUserGuesses(userGuess);
			
		}
		finishGame();
	}
	
	private void checkUserGuesses(String userGuess){
		noOfGuesses++;
		String result = "miss";
		
		for (DotCom dotComToTest : dotComList){
			result = dotComToTest.checkYourself(userGuess);
			
			if (result.equals("hit")){
				break;
			}
			
			if (result.equals("kill")){
				dotComList.remove(dotComToTest);
				break;
			} 
		}
		System.out.println(result);
	}
	
	private void finishGame(){
		System.out.println("All Dot Coms are Dead! Your stock is now worthless");
		if(noOfGuesses <= 18){
			System.out.println("It only took you" + noOfGuesses +"guesses");
			System.out.println("You got there before your options sank");
		} else{
			System.out.println("You took long enough." + noOfGuesses +"guesses");
			System.out.println("It only took you" + noOfGuesses +"guesses");
		}
	}

	public static void main(String[] args) {
		DotComBust game = new DotComBust();
		game.setUpGame();
		game.startPlaying();
	}

}
