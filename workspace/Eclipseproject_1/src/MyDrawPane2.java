import javax.swing.*;

import java.awt.*;

public class MyDrawPane2 extends JPanel {
	
	public void paintComponent (Graphics g){
		Graphics2D g2d = (Graphics2D) g;
		
		GradientPaint gradient = new GradientPaint(50, 50, Color.blue, 150, 150, Color.ORANGE);
		
		g2d.setPaint(gradient);
		
		g.fillOval(10, 50, 100, 100);
		
	}

}
