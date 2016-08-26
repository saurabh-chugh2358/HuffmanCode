package Chapter14;

import java.io.*;

public class Pond implements Serializable{

	private transient Duck myDick = new Duck();
	
	public static void main(String[] args) {
		Pond myPond = new Pond();
		
		try {
			FileOutputStream fs = new FileOutputStream("Pond.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			
			os.writeObject(myPond);
			os.close();
			
		}catch (Exception ex) {ex.printStackTrace();}

	}
}


class Duck {
	
}