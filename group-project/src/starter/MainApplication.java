package starter;

import acm.graphics.GImage;

public class MainApplication extends GraphicsApplication {
	public static final int WINDOW_WIDTH = 800;
	public static final int WINDOW_HEIGHT = 600;


	private FirstLevel startRoom;
	private MenuPane menu;
	private LoseScreen lose;
	private WinScreen win;
	private int count;

	public void init() {
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
	}

	public void run() {
		System.out.println("Game has started!");
		
		
		// test
		
		GImage floor = new GImage("floor.png", 0, 0);
		floor.setSize(800, 600);
		GImage topWall = new GImage("wall.png", 0, 0);
		GImage botWall = new GImage("wall.png", 0, 550);
		GImage leftWall = new GImage("wall.png", 0, 0);
		GImage rightWall = new GImage("wall.png", 775, 0);
		topWall.setSize(800, 50);
		botWall.setSize(800, 50);
		leftWall.setSize(25, 600);
		rightWall.setSize(25, 600);
		
		GImage inStairs = new GImage("stairs.png", 50, 250);
		GImage outStairs = new GImage("stairs.png", 800, 250);
		inStairs.setSize(-50, 100);
		outStairs.setSize(50, 100);
		
		startRoom = new FirstLevel(this, floor, topWall, botWall, inStairs, outStairs, leftWall, rightWall);
		
		
		
		menu = new MenuPane(this);
		lose = new LoseScreen(this);
		win = new WinScreen(this);
		switchToMenu();
	}

	public void switchToMenu() {
//		startRoom = new FirstLevel(this);
		switchToScreen(menu);
	}

	public void switchToFirst() {
		switchToScreen(startRoom);
	}
	
	public void switchToLose() {
		switchToScreen(lose);
	}
	
	public void switchToWin() {
		switchToScreen(win);
	}
}
