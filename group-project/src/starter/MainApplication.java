package starter;
public class MainApplication extends GraphicsApplication {
	public static final int WINDOW_WIDTH = 800;
	public static final int WINDOW_HEIGHT = 600;


	private FirstLevel startRoom;
	private MenuPane menu;
	private int count;

	public void init() {
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
	}

	public void run() {
		System.out.println("Game has started!");
		startRoom = new FirstLevel(this);
		menu = new MenuPane(this);
		switchToMenu();
	}

	public void switchToMenu() {
		count++;
		switchToScreen(menu);
	}

	public void switchToFirst() {
		switchToScreen(startRoom);
	}
}
