package starter;


/* File: GraphicsPane.java
 * -----------------------
 * Like you did with your own graphics programs, simply
 * extend from GraphicsPane and implement
 * as little or as much of the mouse listeners that you need
 * for your own programs.  Notice however that in this situation
 * There is no access to the GraphicsProgram window.
 * Make sure to distinguish between your constructor
 * and using showContents and hideContents
 */

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public abstract class CharacterInteraction implements Interfaceable {
	static boolean[] Keys = new boolean[4];
	@Override
	public abstract void showContents();

	@Override
	public abstract void hideContents();

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
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
