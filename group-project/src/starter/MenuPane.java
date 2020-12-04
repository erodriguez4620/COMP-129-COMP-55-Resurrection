package starter;
import java.applet.*;
import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.*;

public class MenuPane extends GraphicsPane {
	private MainApplication program; // you will use program to get access to
										// all of the GraphicsProgram calls
	private GButton play;
	private GImage menu;
	
	public MenuPane(MainApplication app) {
		super();
		program = app;
		
		menu = new GImage("mockup-for-game-comp55-startup-menu.jpg", 0, 0);

		play = new GButton("", 265, 378, 269, 72);
		play.setVisible(false);
	}

	@Override
	public void showContents() {
		program.add(menu);
		program.add(play);

	}

	@Override
	public void hideContents() {
		program.remove(play);
		program.remove(menu);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		GObject obj = program.getElementAt(e.getX(), e.getY());
		if (obj == play) {
			program.switchToFirst();
		}
	}
}
