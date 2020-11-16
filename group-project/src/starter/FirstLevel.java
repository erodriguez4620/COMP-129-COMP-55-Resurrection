package starter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import acm.graphics.GImage;
import acm.graphics.GObject;

public class FirstLevel extends CharacterInteraction implements ActionListener {
	private MainApplication program; // you will use program to get access to
										// all of the GraphicsProgram calls
	private GImage img;
	static boolean[] Keys = new boolean[4];
	private boolean spawningCycleOn = false;

	public FirstLevel(MainApplication app) {
		this.program = app;
		img = new GImage("hero.png", 100, 100);
	}

	@Override
	public void showContents() {
		program.add(img);
	}

	@Override
	public void hideContents() {
		program.remove(img);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		GObject obj = program.getElementAt(e.getX(), e.getY());
		if (obj == img) {
			program.switchToMenu();
		System.out.println("left mouse has been pressed");
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	//TO-DO
	}
}