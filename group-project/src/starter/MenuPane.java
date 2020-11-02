package starter;
import java.applet.*;
import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.*;

public class MenuPane extends CharacterInteraction {
	private MainApplication program; // you will use program to get access to
										// all of the GraphicsProgram calls
	private GButton rect;
	private GRect background;
	
	public MenuPane(MainApplication app) {
		super();
		program = app;
		
		background = new GRect(0, 0, 1000, 1000);
		background.setColor(Color.BLACK);
		background.setFilled(true);

		rect = new GButton("Start Game", 300, 350, 200, 100);
		rect.setFillColor(Color.GREEN);
	}

	@Override
	public void showContents() {
		program.add(background);
		program.add(rect);

	}

	@Override
	public void hideContents() {
		program.remove(rect);
		program.remove(background);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		GObject obj = program.getElementAt(e.getX(), e.getY());
		if (obj == rect) {
			program.switchToFirst();
		}
	}
}
