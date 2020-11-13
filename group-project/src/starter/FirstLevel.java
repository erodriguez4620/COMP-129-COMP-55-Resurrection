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

	public FirstLevel(MainApplication app) {
		this.program = app;
		img = new GImage("robot head.jpg", 100, 100);
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
		if(e.getKeyCode() == KeyEvent.VK_W) {
			Keys[0] = false;
		System.out.println("W key pressed");
		}
		if(e.getKeyCode() == KeyEvent.VK_A) {
			Keys[1] = false;
		System.out.println("A key pressed");
		}
		if(e.getKeyCode() == KeyEvent.VK_S) {
			Keys[2] = false;
		System.out.println("S key pressed");{
		}
		if(e.getKeyCode() == KeyEvent.VK_D) {
			Keys[3] = false;
		System.out.println("D key pressed");
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_W) {
			Keys[0] = false;
		System.out.println("W key pressed");
		}
		if(e.getKeyCode() == KeyEvent.VK_A) {
			Keys[1] = false;
		System.out.println("A key pressed");
		}
		if(e.getKeyCode() == KeyEvent.VK_S) {
			Keys[2] = false;
		System.out.println("S key pressed");{
		}
		if(e.getKeyCode() == KeyEvent.VK_D) {
			Keys[3] = false;
		System.out.println("D key pressed");
			}
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}
}