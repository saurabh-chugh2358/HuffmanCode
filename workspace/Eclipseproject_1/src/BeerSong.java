
public class BeerSong {

	public static void main(String[] args) {
		int beernum= 99;
		String word = "bottles";
		
		while (beernum>=0){
			if (beernum == 1){
				word = "bottle";
			}
			
			System.out.println(beernum + " " + word + " of beer on the wall");
			System.out.println(beernum + " " + word + " of beer");
			System.out.println("Take one down");
			System.out.println("Pass it around");
			
			beernum -= 1;
			
			if (beernum>0){
				System.out.println(beernum + " " + word + " of beer on the wall");
			}
			else {
				for (int x = 2; x>0;x--){
					System.out.println("No more bottles of beer on the wall");
				}
				System.out.println("No more bottles of beer");
			}
			
		}

	}

}
