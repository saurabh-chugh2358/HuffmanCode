package Chapter14;

import java.io.*;


public class Box implements Serializable{
	private int weight;
	private int height;
	
	public void setWeight(int w) {
		weight = w;
	}
	
	public void setHeight(int h) {
		height = h;
	}

	public static void main(String[] args) {
		
		Box myBox = new Box();
		myBox.setWeight(50);
		myBox.setHeight(70);
		
		try {
			FileOutputStream fs = new FileOutputStream("foo.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(myBox);
			os.close();
		}catch (Exception ex) {ex.printStackTrace();}
	}
}
