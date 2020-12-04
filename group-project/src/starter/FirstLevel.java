package starter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import acm.graphics.GImage;
import acm.graphics.GObject;

public class FirstLevel extends GraphicsPane implements ActionListener {
	private MainApplication program; // you will use program to get access to
										// all of the GraphicsProgram calls
	private GImage img;
	static boolean[] Keys = new boolean[4];
	private boolean spawningCycleOn = false;
	private CharacterInteraction input, enemyInput;
	private MainCharacter hero;
	private Enemy enemy;
	private Enemy enemy1;
	private Enemy enemy2;
	
	private GImage floor;
	private GImage topWall, botWall;
	private GImage inStairs;
	private GImage outStairs;
	private GImage leftWall;
	private GImage rightWall;
	
	public FirstLevel(MainApplication app) {
		this.program = app;
	}

	@Override
	public void showContents() {
		generateLevel();
		generateEnemies();
	}

	public void generateLevel() {
		floor = new GImage("floor.png", 0, 0);
		floor.setSize(800, 600);
		
		topWall = new GImage("wall.png", 0, 0);
		botWall = new GImage("wall.png", 0, 550);
		leftWall = new GImage("wall.png", 0, 0);
		rightWall = new GImage("wall.png", 775, 0);
		topWall.setSize(800, 50);
		botWall.setSize(800, 50);
		leftWall.setSize(25, 600);
		rightWall.setSize(25, 600);
		
		inStairs = new GImage("stairs.png", 50, 250);
		outStairs = new GImage("stairs.png", 800, 250);
		inStairs.setSize(-50, 100);
		outStairs.setSize(-50, 100);
		
		hero = new MainCharacter(50, 275, 10, 10);
		input = new CharacterInteraction(hero, null);
		
		program.add(floor);
		
		program.add(leftWall);
		program.add(rightWall);
		program.add(topWall);
		program.add(botWall);
		
		program.add(inStairs);
		program.add(outStairs);
		
		
		program.add(hero.getCharacter());
	}
	
	public void generateEnemies() {
		enemy = new Enemy(EnemyType.SLIME, 5, 5, false, 600, 100, true);
		enemyInput = new CharacterInteraction(null, enemy);
		
		enemy1 = new Enemy(EnemyType.GOBLIN, 5, 5, true, 50, 100, false);
		enemyInput = new CharacterInteraction(null, enemy1);
		
		enemy2 = new Enemy(EnemyType.BOSS, 5, 5, true, 600, 100, false);
		enemyInput = new CharacterInteraction(null, enemy2);
		
		program.add(enemy.getEnemyImage());
		program.add(enemy1.getEnemyImage());
		program.add(enemy2.getEnemyImage());
	}
	
	@Override
	public void hideContents() {
		program.removeAll();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		GObject obj = program.getElementAt(e.getX(), e.getY());
		if (obj == img) {
			program.switchToMenu();
		System.out.println("left mouse has been pressed");
		}
	}
	
public void keyPressed(KeyEvent e) {
//hero movement		
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
//hero bounds kind of
public void HeroMoveLeft() {
	if (hero.getXPosPlayer() - 5 >= 25) {
		hero.tick(-5.0, 0);
	}
}
public void HeroMoveRight() {
   if (hero.getXPosPlayer() + 55 <= 775) {
	   hero.tick(5, 0);
   }
}
public void HeroMoveUp() {
	if (hero.getYPosPlayer() - 5 >= 50) {
		hero.tick(0, -5);
	}
}
public void HeroMoveDown() {
	if (hero.getYPosPlayer() + 55 <= 550) {
		hero.tick(0, 5);
	}
  }

	@Override
	public void actionPerformed(ActionEvent e) {
	//TO-DO
	}
}