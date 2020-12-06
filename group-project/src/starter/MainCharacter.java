package starter;
import java.awt.Graphics;
import java.awt.Rectangle;

import acm.graphics.GImage;
import acm.graphics.GRect;
import acm.graphics.GRectangle;
import acm.program.GraphicsProgram;

public class MainCharacter extends GraphicsProgram {	
	private int dx, dy;
	public int playerHP; //player's HP
	private Item item; //what item the player is holding
	private GImage character;
	private GRectangle hitbox;
	MainApplication program;
	//Could modify value
	public int attackCooldown = 7;
	private int attackValue = 7;
	
	public MainCharacter(double x, double y, int dx, int dy) {
		character = new GImage ("hero.png", x, y);
		item = new Item(ItemType.WEAPON, 10);
		character.setSize(50, 50);
		hitbox = new GRectangle(x - 5, y - 5, 60, 60);
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
	public GRectangle getHitBox() {
		return hitbox;
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
		hitbox.translate(x, y);
		//System.out.println("x location: " + hitbox.getX());
		//System.out.println("y location: " + hitbox.getY());
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
	public void decreaseAttackCooldown() {
		attackCooldown--;
	}
	public void resetAttackCooldown() {
		attackCooldown = 7;
	}
	public int getAttackCooldown() {
		return attackCooldown;
	}
	public int getAttackValue() {
		return attackValue;
	}
	public void setAttackValue(int value) {
		attackValue = value;
	}
	

}
