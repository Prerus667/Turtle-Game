import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;


public class Driver {
	
	public static void main(String[] args) {
		JFrame window = new JFrame("Turtle Game");
		TurtleGame board = new TurtleGame();
		window.setContentPane(board);
		window.setJMenuBar( new MineMenus(board) );
		window.pack();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		window.setLocation( (screenSize.width - window.getWidth()) / 2, 
				(screenSize.height - window.getHeight()) / 2 );
		window.setVisible(true);
	}

}
