package starter;
import java.awt.Graphics;
import java.awt.Rectangle;

public class MainCharacter extends Rectangle {	
	private int dx, dy;
	public int playerHP; //player's HP
	private ItemType item; //what item the player is holding
	Space player; //where the player will be
	
	
	 public MainCharacter(ItemType item, int playerHP, Space player) {
		this.item = item;
		this.playerHP = playerHP;
		this.player = player;
	}

	//Getters
	public int getPlayerHP() {
		return playerHP;
	}

	public ItemType getItem() {
		return item;
	}
	
	public Space getPlayer() {
		return player;
	}

	
	//Setters
	public void setPlayerHP(int playerHP) {
		this.playerHP = playerHP;
	}
	
	public void setItem(ItemType item) {
		this.item = item;
	}

	public void setPlayer(Space player) {
		this.player = player;
	}
	
	public MainCharacter(int x, int y, int width, int height, int dx, int dy) {
		setBounds(x,y,width,height);
		 this.dx = dx;
		 this.dy= dy;
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
