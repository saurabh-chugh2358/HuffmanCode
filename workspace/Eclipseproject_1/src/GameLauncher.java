
public class GameLauncher {

	public static void main(String[] args) {
		Player player = new Player();
		boolean match;
		
		GuessGame game = new GuessGame();
		for (match = false;match == false;){
			game.getplayernumbers();
			match = game.getmatch();
		}
		System.out.println("We have a winner.");
		player = game.getwinner();		
		System.out.println(player.status);
		game.getplayerstatus();
		player.status = "We've changed status of object through the copy of remote";
		game.getplayerstatus();	
		
		// Hash Code for both the objects has to be same because 
		// as the object was passed as a copy, so both the rerferences  are refering to the same object. 
		System.out.println(player.hashCode());
	}

}


class Player {
	 int pnumber;
	 String status;
	
	public void guess(){
		pnumber = (int) (Math.random() * 9);
		//return pnumber;
	}
}

class GuessGame {
	
	boolean matchfound;
	int gnumber;
	Player p1 = new Player();
	Player p2 = new Player();
	Player p3 = new Player();
	
	public GuessGame() {
		gnumber = (int) (Math.random() * 9);
		System.out.println("Number to guess is: " + gnumber);
	}
	
	//int np1;
	public void getplayernumbers(){
		p1.guess();
		System.out.println("Player one guessed: "+ p1.pnumber);
		
		p2.guess();
		System.out.println("Player two guessed: "+ p2.pnumber);
		
		p3.guess();
		System.out.println("Player three guessed: "+ p3.pnumber);
	}
	
	public boolean getmatch() {
		
		if (gnumber == p1.pnumber){
			p1.status = "Player1 Wins...!";
			matchfound = true;
			return matchfound;
		}
		else if (gnumber == p2.pnumber){
			p2.status = "Player2 Wins...!";
			matchfound = true;
			return matchfound;
		}
		else if (gnumber == p3.pnumber){
			p3.status = "Player3 Wins...!";
			matchfound = true;
			return matchfound;
		}
		else {
			System.out.println("Players will have to try again.");
			matchfound = false;
			return matchfound;
		}
	}
	
	public Player getwinner(){
		
		if (gnumber == p1.pnumber){
			System.out.println(p1.hashCode());
			return p1;
		}
		else if (gnumber == p2.pnumber){
			System.out.println(p2.hashCode());
			return p2;
		}
		else if (gnumber == p3.pnumber){
			System.out.println(p3.hashCode());
			return p3;
		}
		return null;
	}
	
	public void getplayerstatus(){
		System.out.println(p1.status);
		System.out.println(p2.status);
		System.out.println(p3.status);
	}
	
}