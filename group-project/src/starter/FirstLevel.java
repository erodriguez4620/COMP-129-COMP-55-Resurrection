package starter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import acm.graphics.GImage;
import acm.graphics.GObject;

public class FirstLevel extends CharacterInteraction {
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
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("moused has been dragged ");
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		System.out.println("moused has moved ");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (spawningCycleOn)
			switch (e.getKeyCode()) {
			case KeyEvent.VK_UP:
			System.out.println("ARROW UP key pressed");
			case KeyEvent.VK_W:
			//TO-DO
			System.out.println("W key pressed");
				break;
			case KeyEvent.VK_DOWN:
			System.out.println("ARROW DOWN key pressed");
			case KeyEvent.VK_S:
			//TO-DO
			System.out.println("S key pressed");
				break;
			case KeyEvent.VK_LEFT:
			System.out.println("ARROW lEFT key pressed");
			case KeyEvent.VK_A:
			//TO-DO
			System.out.println("A key pressed");
				break;
			case KeyEvent.VK_RIGHT:
			System.out.println("ARROW RIGHT key pressed");
			case KeyEvent.VK_D:
			//TO-DO
			System.out.println("D key pressed");
				break;
			case KeyEvent.VK_SPACE:
				spawningCycleOn = false;
				//program.switchToMenu();
			}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}
}