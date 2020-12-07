package starter;


import acm.graphics.GImage;
import acm.graphics.GRectangle;

public class Enemy {

	private EnemyType enemyName;
	private Item itemDrop;
	private GImage enemyImage;
	
	int enemyHP;
	int damage;
	int attackRadius;
	boolean isVertical;
	boolean movePositive;
	
	boolean isMoving;
	private GRectangle attackRange;
	private int unagroTurns = 20;
	private int movesUntilAttack = 10;
	
	public Enemy(EnemyType enemyName, int enemyHP, int damage, boolean isVertical, double x, double y, boolean direction) {
		this.enemyName = enemyName;
		this.enemyHP = enemyHP;
		this.damage = damage;
		this.isVertical = isVertical;
		movePositive = direction;
		isMoving = true;
		int width = 0;
		int height = 0;
		
		if (enemyName.toString() == "slime") {
			enemyImage = new GImage("slime-green.png", x, y);
			width = 40;
			height = 30;
		}
		else if (enemyName.toString() == "boss") {
			enemyImage = new GImage("boss.png", x, y);
			width = 90;
			height = 90;
		}
		else if (enemyName.toString() == "goblin") {
			enemyImage = new GImage("goblin.png", x, y);
			width = 40;
			height = 50;
		}
		else if (enemyName.toString() == "chest") {
			enemyImage = new GImage("chest-closed.png", x, y);
			width = 50;
			height = 50;
		} else if (enemyName.toString() == "deadenemy") {
			enemyImage = new GImage("deadboi.png", x, y);
			width = 50;
			height = 50;
		}
		enemyImage.setSize(width, height);
		attackRange = new GRectangle(x - 35, y - 35, width + 70, height + 70);
	}
	
	public GRectangle getAttackRange() {
		return attackRange;
	}
	
	public String toString() {
		return enemyName.toString();
	}
	public int getAgro() {
		return unagroTurns;
	}

	
	//Getters
	public int getMovesUntilAttack() {
		return movesUntilAttack;
	}
	public EnemyType getEnemyName() {
		return enemyName;
	}

	public double getEnemyXPosition() {
		return enemyImage.getX();
	}
	
	public double getEnemyYPosition() {
		return enemyImage.getY();
	}

	public int getEnemyHp() {
		return enemyHP;
	}

	public int getDamage() {
		return damage;
	}
	
	public boolean getIsVertical() {
		return isVertical;
	}
	
	public GImage getEnemyImage() {
		return enemyImage;
	}
	
	public boolean getIsMovePostive() {
		return movePositive;
	}
	public boolean getMoving() {
		return isMoving;
	}
	
	//Setters
	public void setMoving(boolean move) {
		isMoving = move;
	}
	public void decreaseAgro() {
		unagroTurns--;
	}
	public void resetAgro() {
		unagroTurns = 20;
	}
	public void setEnemyName(EnemyType enemyName) {
		this.enemyName = enemyName;
	}

	public void setEnemyHp(int enemyHP) {
		this.enemyHP = enemyHP;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}
	
	public void setIsVertical(boolean isVertical) {
		this.isVertical = isVertical;
	}
	
	public void setEnemyImage(GImage image) {
		enemyImage = image;
	}
	
	public void setMovePostive(boolean direction) {
		movePositive = direction;
	}
	public void decreaseMovesAttack() {
		movesUntilAttack--;
	}
	public void resetMovesAttack() {
		movesUntilAttack = 10;
	}
	
	//Check if enemy is dead
	public boolean isdead(int enemyHP) {
		if (enemyHP <= 0) {
			return true; 
		}
		return false;
	}
	
	/*checks if enemy is a chest
	 * if enemy is a chest then drop item
	 */
	public Item dropItem(EnemyType enemyName) {
		if (enemyName.toString() == "chest") {
			return itemDrop;
		}
		return null;
	}
	
	public void turnToSkull() {
		double x = enemyImage.getX();
		double y = enemyImage.getY();
		
		enemyImage = new GImage("deadboi.png", x, y);
		enemyImage.setSize(50, 50);
		
		System.out.println("Homie dead");
	}
	
	//text based test
	public static void main(String[] args) {
		
		//Enemy enemy1 = new Enemy(EnemyType.GOBLIN, 5, 5, 50, 15, true);
		//Enemy enemy2 = new Enemy(EnemyType.SLIME, 7, 4, 20, 5, false);
		Enemy enemy3 = new Enemy(EnemyType.GOBLIN, 200, 25, true, 100, 200, true);
		
		//System.out.println("The enemy spawned is: " + enemy1.toString() + " Their X postion is: (" + enemy1.getEnemyXPosition() + ") Their Y Position is: (" + enemy1.getEnemyYPosition() + ") Its HP is: " + enemy1.getEnemyHp() + " It hits for: " + enemy1.getDamage() + " Enemy is moving vertically: " + enemy1.getIsVertical());
		//System.out.println("The enemy spawned is: " + enemy2.toString() + " Their X postion is: (" + enemy2.getEnemyXPosition() + ") Their Y Position is: (" + enemy2.getEnemyYPosition() + ") Its HP is: " + enemy2.getEnemyHp() + " It hits for: " + enemy2.getDamage() + " Enemy is moving vertically: " + enemy2.getIsVertical());
		System.out.println("The enemy spawned is: " + enemy3.toString() + " Their X postion is: (" + enemy3.getEnemyXPosition() + ") Their Y Position is: (" + enemy3.getEnemyYPosition() + ") Its HP is: " + enemy3.getEnemyHp() + " It hits for: " + enemy3.getDamage() + " Enemy is moving vertically: " + enemy3.getIsVertical());
	}

}
