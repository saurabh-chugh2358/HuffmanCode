import javax.swing.*;
import java.awt.*;

public class SimpeAnimation {
	int x = 70;
	int y = 70;

	public static void main(String[] args) {
		SimpeAnimation gui = new SimpeAnimation();
		gui.go();
	}
	
	public void go() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyDrawPane3 drawPanel = new MyDrawPane3();
		
		frame.getContentPane().add(drawPanel);
		frame.setSize(500, 500);
		frame.setVisible(true);
		
		for (int i =0; i<230; i++){
			x++; y++;
			//frame.repaint();
			drawPanel.repaint();
			try {
				Thread.sleep(10);
			} catch (Exception ex) { }
		}
		
		
	}
	
	class MyDrawPane3 extends JPanel {
		public void paintComponent(Graphics g) {
			
			g.setColor(Color.black);
			g.fillRect(0, 0, this.getWidth(), this.getHeight());
			
			g.setColor(Color.green);
			g.fillOval(x, y, 40, 40);
			
			
		}
	}

}
