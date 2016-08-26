import javax.swing.*;
import java.awt.*;

 class MyDrawPane1 extends JPanel {

	
	public void paintComponent (Graphics g){
		
		int red = (int) (Math.random()*255);
		int green = (int) (Math.random()*255);
		int blue = (int) (Math.random()*255);
		
		Color randomColor = new Color(red, green, blue);
		
		
		g.setColor(randomColor);
		g.fillOval(300, 50, 100, 100);
		
	}

}
