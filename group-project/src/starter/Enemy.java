package starter;

public class Enemy {

	private EnemyType enemyName;
	private Space position;
	private Item itemDrop;
	
	int enemyHP;
	int damage;
	int attackRadius;
	boolean isVertical;
	
	public Enemy(EnemyType enemyName, Space position,int enemyHP, int damage, boolean isVertical) {
		this.enemyName = enemyName;
		this.position = position;
		this.enemyHP = enemyHP;
		this.damage = damage;
		this.isVertical = isVertical;
	}
	
	public String toString() {
		return enemyName.toString();
	}

	//Getters
	
	public EnemyType getEnemyName() {
		return enemyName;
	}

	public Space getPosition() {
		return position;
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

	//Setters
	
	public void setEnemyName(EnemyType enemyName) {
		this.enemyName = enemyName;
	}

	public void setPosition(Space position) {
		this.position = position;
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
	
	//text based test
	public static void main(String[] args) {
		Space space1 = new Space(0, 100);
		Space space2 = new Space(100, 200);
		Space space3 = new Space(200, 300);
		
		Enemy enemy1 = new Enemy(EnemyType.GOBLIN, space1, 50, 15, true);
		Enemy enemy2 = new Enemy(EnemyType.SLIME, space2, 20, 5, false);
		Enemy enemy3 = new Enemy(EnemyType.GOBLIN, space3, 200, 25, true);
		
		System.out.println("The enemy spawned is: " + enemy1.toString() + " Their postion is: (" + space1.getRow() + ", " + space1.getCol() + ") Its HP is: " + enemy1.getEnemyHp() + " It hits for: " + enemy1.getDamage() + " Enemy is moving vertically: " + enemy1.getIsVertical());
		System.out.println("The enemy spawned is: " + enemy2.toString() + " Their postion is: (" + space2.getRow() + ", " + space2.getCol() + ") Its HP is: " + enemy2.getEnemyHp() + " It hits for: " + enemy2.getDamage() + " Enemy is moving vertically: " + enemy2.getIsVertical());
		System.out.println("The enemy spawned is: " + enemy3.toString() + " Their postion is: (" + space3.getRow() + ", " + space3.getCol() + ") Its HP is: " + enemy3.getEnemyHp() + " It hits for: " + enemy3.getDamage() + " Enemy is moving vertically: " + enemy3.getIsVertical());
	}
	
}
