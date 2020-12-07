package starter;

public enum EnemyType {
GOBLIN, SLIME, BOSS, CHEST, DEADENEMY;
	public String toString() {
		switch (this) {
		case GOBLIN: return "goblin";
		case SLIME: return "slime";
		case BOSS: return "boss";
		case CHEST: return "chest";
		case DEADENEMY: return "deadenemy";
		}
		return "n/a";
	}
}
