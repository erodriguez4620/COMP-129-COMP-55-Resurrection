package starter;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

import javax.swing.Timer;
import java.awt.*;
import java.util.*;

public class CharacterInteraction implements ActionListener {
	static boolean[] Keys = new boolean[4];
	public Enemy enemy;//Using this to make the function
	public MainCharacter hero;
	
	//make sure to add map bounds
	public final int RIGHTXBOUND = 775;
	public final int LEFTXBOUND = 25;
	public final int BOTTOMYBOUND = 550;
	public final int TOPYBOUND = 50;
	public final int HEROSIZE = 50;
	
	//public final int ENEMYSIZE = 60; (Replaced with enemy.getEnemyImage().getBounds().getWidth() and enemy.getEnemyImage().getBounds().getHeight())
	
	public CharacterInteraction(MainCharacter hero, Enemy enemy) {
		this.hero = hero;
		this.enemy = enemy;
		
		if (enemy != null) {
			//This is a timer to make the enemy move after a certain amount of time
			Timer enemyTimer = new Timer(500, this);
			enemyTimer.start();
		}
	}
	
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	public void mouseDragged(MouseEvent e) {
		System.out.println("moused has been dragged ");
	}

	public void mouseMoved(MouseEvent e) {
		System.out.println("moused has moved ");
	}

	public void keyPressed(KeyEvent e) {
		
		if (e.getKeyCode() == KeyEvent.VK_W || e.getKeyCode() == KeyEvent.VK_UP)  {
			System.out.println("Character is being moved up");
			HeroMoveUp();
		}
		else if (e.getKeyCode() == KeyEvent.VK_S || e.getKeyCode() == KeyEvent.VK_DOWN) {
			System.out.println("Character is being moved down");
			HeroMoveDown();
		}
		else if (e.getKeyCode() == KeyEvent.VK_A || e.getKeyCode() == KeyEvent.VK_LEFT) {
			System.out.println("Character is being moved left");
			HeroMoveLeft();
		}
		else if (e.getKeyCode() == KeyEvent.VK_D || e.getKeyCode() == KeyEvent.VK_RIGHT) {
			System.out.println("Character is being moved right");
			HeroMoveRight();
		}
	}

	public void keyReleased(KeyEvent e) {
		
		if (e.getKeyCode() == KeyEvent.VK_W || e.getKeyCode() == KeyEvent.VK_UP)  {
			System.out.println("Character is being moved up");
			HeroMoveUp();
		}
		else if (e.getKeyCode() == KeyEvent.VK_S || e.getKeyCode() == KeyEvent.VK_DOWN) {
			System.out.println("Character is being moved down");
			HeroMoveDown();
		}
		else if (e.getKeyCode() == KeyEvent.VK_A || e.getKeyCode() == KeyEvent.VK_LEFT) {
			System.out.println("Character is being moved left");
			HeroMoveLeft();
		}
		else if (e.getKeyCode() == KeyEvent.VK_D || e.getKeyCode() == KeyEvent.VK_RIGHT) {
			System.out.println("Character is being moved right");
			HeroMoveRight();
		}
	}

	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}
	
	public void characterDealsDamage(Enemy enemy) {
		enemy.setEnemyHp(enemy.getEnemyHp() - hero.getItem().getValuePoint());
	}
	
	public void enemyDealsDamage(Enemy enemy) {
		hero.setPlayerHP(hero.getPlayerHP() - enemy.getDamage());
	}
	public void HeroMoveLeft() {
		if (hero.getXPosPlayer() - 5 >= LEFTXBOUND) {
			hero.tick(-5.0, 0);
			System.out.println(hero.getXPosPlayer());
		}
	}
	public void HeroMoveRight() {
	   if (hero.getXPosPlayer() + HEROSIZE + 5 <= RIGHTXBOUND) {
		   hero.tick(5, 0);
		   System.out.println(hero.getXPosPlayer());
	   }
	}
	public void HeroMoveUp() {
		if (hero.getYPosPlayer() - 5 >= TOPYBOUND) {
			hero.tick(0, -5);
			System.out.println(hero.getYPosPlayer());
		}
	}
	public void HeroMoveDown() {
		if (hero.getYPosPlayer() + HEROSIZE + 5 <= BOTTOMYBOUND) {
			hero.tick(0, 5);
			System.out.println(hero.getYPosPlayer());
		}
	}

	
	public void run() {
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		double moveAmount = 5;
		
		if(enemy != null) {
		double enemyX = enemy.getEnemyXPosition();
		double enemyY = enemy.getEnemyYPosition();
		
		if(enemy.isVertical) {//vertical interaction
			if(enemyY + moveAmount + enemy.getEnemyImage().getBounds().getHeight() > BOTTOMYBOUND) {
				enemy.setMovePostive(false);
				//Enemy is moving up
			} else if (enemyY - moveAmount - enemy.getEnemyImage().getBounds().getHeight() < TOPYBOUND){
				enemy.setMovePostive(true);
				//Enemy is moving down
			}
			if (!enemy.movePositive) {
				moveAmount = -5;
			}
			enemy.getEnemyImage().move(0, moveAmount);
			enemy.getAttackRange().translate(0.00, moveAmount);
		} 
		else {
			if(enemyX + moveAmount + enemy.getEnemyImage().getBounds().getWidth() > RIGHTXBOUND) {
				enemy.setMovePostive(false);
				//Enemy is moving left
			} else if (enemyX - moveAmount - enemy.getEnemyImage().getBounds().getWidth() < LEFTXBOUND){
				enemy.setMovePostive(true);
				//Enemy is moving right
			}
			if (!enemy.movePositive) {
				moveAmount = -5;
			}
			enemy.getEnemyImage().move(moveAmount, 0);
			enemy.getAttackRange().translate(0.00, moveAmount);
			System.out.println("x pos: " + enemy.getAttackRange().getX());
			System.out.println("y pos: " + enemy.getAttackRange().getY());
			}
		}
		
//		if(hero != null) {
//			double heroX = hero.getXPosPlayer();
//			double heroY = hero.getYPosPlayer();
//			
//		if(heroX - moveAmount > LEFTXBOUND) {
//			heroX -= 5;
//		} 
//		if((heroX + HEROSIZE + moveAmount) < RIGHTXBOUND) {
//			heroX += 5;
//		}
//		
//		if(heroY - moveAmount > TOPYBOUND) {
//			heroY -= 5;
//		}
//		if((heroY + HEROSIZE + moveAmount) < BOTTOMYBOUND) {
//			heroY += 5;
//			}
//		}
		
	}
	
}
