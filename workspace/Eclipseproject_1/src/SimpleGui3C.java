import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleGui3C implements ActionListener {
	
	JFrame frame;

	public static void main(String[] args) {
		SimpleGui3C gui = new SimpleGui3C();
		gui.go();

	}
	
	public void go() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton button = new JButton();
		button.addActionListener(this);
		
		MyDrawPane1 drawPane1 = new MyDrawPane1();
		MyDrawPane2 drawPane2 = new MyDrawPane2();
		
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		frame.getContentPane().add(BorderLayout.CENTER, drawPane1);
		frame.getContentPane().add(BorderLayout.WEST, drawPane2);
		frame.setSize(800, 800);
		frame.setVisible(true);
	}
	
	public void actionPerformed (ActionEvent event){
		frame.repaint();
	}

}
