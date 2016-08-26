
public class PlayerTestDrive {

	public static void main(String[] args) {
		System.out.println(NewPlayer.playercntr);
		NewPlayer p1 = new NewPlayer("Rahul Dravid");
		System.out.println(NewPlayer.playercntr);
		NewPlayer.getInstances();
		NewPlayer [] p_arr;
		p_arr = new NewPlayer[5];
		p_arr[0] = new NewPlayer("Saurabh");
		p_arr[1] = new NewPlayer("Rohit");
		p_arr[2] = new NewPlayer("Mohit");
		p_arr[3] = new NewPlayer("Sachin");
		p_arr[4] = new NewPlayer("Dhoni");
		
		NewPlayer.getInstances();
		
	}

}

class NewPlayer {
	static int playercntr;
	private String pname;
	
	public NewPlayer (String n){
		pname = n;
		playercntr++;
	}
	
	public static void getInstances() {
		System.out.println(NewPlayer.playercntr);
	}
	
}