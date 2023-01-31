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
		
		startRoom = new FirstLevel(this, "C:\\Users\\rando\\git\\COMP-129-COMP-55-Resurrection\\group-project\\src\\starter\\temp.txt");
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
