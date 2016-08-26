
public class PhaseOMatic {

	public static void main(String[] args) {
		String [] wordList1 = {"24/7", "multi-tier", "30,000 feet", 
				"B-to-B", "win-win", "front-end", "web-based", "pervasive", "smart", "six-sigma", 
				"critical path", "dynamic"};
		
		String [] wordList2 = {"empowered", "sticky",
				"value-added", "oriented", "centric", "distributed",
				"clustered", "branded","outside-the-box", "positioned",
				"networked", "focused", "leveraged", "aligned",
				"targeted", "shared", "cooperative", "accelerated"};
		
		String [] wordList3 = {"process", "tippingpoint",
				"solution", "architecture", "core competency",
				"strategy", "mindshare", "portal", "space", "vision",
				"paradigm", "mission"};
		
		int oneLength = wordList1.length;
		int twoLength = wordList2.length;
		int threeLength = wordList3.length;
		
		/* the random() method returns a random number between zero and not quite 1, so we have to multiply 
		  it with arrays' length.
		   We've to force the result to be an integer, so we put in a cast */
		
		int rand1 = (int) (Math.random()*oneLength);
		int rand2 = (int) (Math.random()*twoLength);
		int rand3 = (int) (Math.random()*threeLength);
		
		String phrase = wordList1[rand1] + " " + wordList2[rand2] + " " + wordList3[rand3];
		
		System.out.println("What we need is a " + phrase);

	}

}
