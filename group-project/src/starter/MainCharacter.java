package starter;
import java.awt.Graphics;
import java.awt.Rectangle;

import acm.graphics.GImage;
import acm.graphics.GRect;

public class MainCharacter {	
	private int dx, dy;
	public int playerHP; //player's HP
	private Item item; //what item the player is holding
	private GImage character;
	
	public MainCharacter(double x, double y, int dx, int dy) {
		character = new GImage ("hero.png", x, y);
		item = new Item(ItemType.WEAPON, 10);
		character.setSize(50, 50);
	}
	public boolean hasItem() {
		return item != null;
	}
	//Getters
	public int getPlayerHP() {
		return playerHP;
	}

	public Item getItem() {
		return item;
	}
	
	public double getXPosPlayer() {
		return character.getX();
	}
	
	public double getYPosPlayer() {
		return character.getY();
	}

	//Setters
	public void setPlayerHP(int playerHP) {
		this.playerHP = playerHP;
	}
	
	public void setItem(Item item) {
		this.item = item;
	}

	public void setPlayerPosition(double x, double y) {
		character.setLocation(x, y);
	}
	
	public void tick(double x, double y) {
		character.move(x, y);
	}
//	void draw(Graphics g) { 
//		g.fillRect(this.x, this.y, this.width, this.height); //drawing player as a box for now but we can user this as a hitbox
//	}
	public GImage getCharacter() {
	return character;
	}
	
	public void setDx(int dx) {
		this.dx = dx;
	}
	
	public void setDy(int dy) {
		this.dy = dy;
	}

}
