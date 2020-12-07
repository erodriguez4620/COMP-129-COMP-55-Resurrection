package starter;
import java.awt.event.MouseEvent;

import acm.graphics.GImage;
import acm.graphics.GObject;


public class LoseScreen extends GraphicsPane {
	private MainApplication program; // you will use program to get access to
	// all of the GraphicsProgram calls
	private GButton playAgain;
	private GImage lost;
	
	public LoseScreen(MainApplication app) {
		super();
		program = app;
		
		lost = new GImage("losescreen.png", 0, 0);

		playAgain = new GButton("", 265, 378, 278, 74);
		playAgain.setVisible(false);
	}
	
	@Override
	public void showContents() {
		program.add(lost);
		program.add(playAgain);
	}
	
	@Override
	public void hideContents() {
		program.removeAll();
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		GObject obj = program.getElementAt(e.getX(), e.getY());
			if (obj == playAgain) {
			program.switchToMenu();
		}
	}


}