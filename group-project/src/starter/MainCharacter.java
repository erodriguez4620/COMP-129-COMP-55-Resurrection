package starter;
import java.awt.Graphics;
import java.awt.Rectangle;

public class MainCharacter extends Rectangle {	
	private int dx, dy;
	
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
		g.fillRect(this.x, this.y, this.width, this.height); //drwaing player as a box for now but we can user this as a hitbox
	}
	
	public void setDx(int dx) {
		this.dx = dx;
	}
	
	public void setDy(int dy) {
		this.dy = dy;
	}

}
