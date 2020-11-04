package starter;

public class Enemy {

	private EnemyType enemyName;
	private Space position;
	
	int enemyHP;
	int damage;
	int attackRadius;
	
	public Enemy(EnemyType enemyName, Space position,int enemyHP, int damage) {
		this.enemyName = enemyName;
		this.position = position;
		this.enemyHP = enemyHP;
		this.damage = damage;
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
	
	//Check if enemy is
	public boolean isdead(int enemyHP) {
		
		if (enemyHP == 0) {
			return true; //make into remove function
		}
		
		return false;
	}
	
	/*
	public int dealDamge(int playerHP) {
		return playerHP;
	}
	*/
	
	//text based test
	public static void main(String[] args) {
		Space space1 = new Space(0, 100);
		Space space2 = new Space(100, 200);
		Space space3 = new Space(200, 300);
		
		Enemy enemy1 = new Enemy(EnemyType.GOBLIN, space1, 50, 15);
		Enemy enemy2 = new Enemy(EnemyType.SLIME, space2, 20, 5);
		Enemy enemy3 = new Enemy(EnemyType.GOBLIN, space3, 200, 25);
		
		System.out.println("The enemy spawned is: " + enemy1.toString() + " Their postion is: (" + space1.getRow() + ", " + space1.getCol() + ") Its HP is: " + enemy1.getEnemyHp() + " It hits for: " + enemy1.getDamage());
		System.out.println("The enemy spawned is: " + enemy2.toString() + " Their postion is: (" + space2.getRow() + ", " + space2.getCol() + ") Its HP is: " + enemy2.getEnemyHp() + " It hits for: " + enemy2.getDamage());
		System.out.println("The enemy spawned is: " + enemy3.toString() + " Their postion is: (" + space3.getRow() + ", " + space3.getCol() + ") Its HP is: " + enemy3.getEnemyHp() + " It hits for: " + enemy3.getDamage());
	}
	
}
