package starter;
import java.awt.event.MouseEvent;

import acm.graphics.GImage;
import acm.graphics.GObject;


public class WinScreen extends GraphicsPane {
	private MainApplication program; // you will use program to get access to
	// all of the GraphicsProgram calls
	private GButton playAgain;
	private GImage win;

	
	public WinScreen(MainApplication app) {
		super();
		program = app;
		
		win = new GImage("winscreen.png", 0, 0);
		
		playAgain = new GButton("", 265, 378, 277, 73);
		playAgain.setVisible(false);
	}
	
	@Override
	public void showContents() {
		program.add(win);
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