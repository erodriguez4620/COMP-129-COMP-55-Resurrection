package starter;
import java.awt.Graphics;
import java.awt.Rectangle;

public class MainCharacter extends Rectangle {	
	private int dx, dy;
	public int playerHP; //player's HP
	private Item item; //what item the player is holding
	 
	public MainCharacter(int x, int y, int width, int height, int dx, int dy) {
			setBounds(x,y,width,height);
			this.dx = dx;
			this.dy= dy;
	}

	//Getters
	public int getPlayerHP() {
		return playerHP;
	}

	public Item getItem() {
		return item;
	}
	
	public int getXPosPlayer() {
		return dx;
	}
	
	public int getYPosPlayer() {
		return dy;
	}

	//Setters
	public void setPlayerHP(int playerHP) {
		this.playerHP = playerHP;
	}
	
	public void setItem(Item item) {
		this.item = item;
	}

	public void setPlayerPosition(int x, int y) {
		dx = x;
		dy = y;
	}
	
	public void tick() {
		this.x += dx;
		this.y += dy;
	}
	void draw(Graphics g) {
		g.fillRect(this.x, this.y, this.width, this.height); //drawing player as a box for now but we can user this as a hitbox
	}
	
	public void setDx(int dx) {
		this.dx = dx;
	}
	
	public void setDy(int dy) {
		this.dy = dy;
	}

}
