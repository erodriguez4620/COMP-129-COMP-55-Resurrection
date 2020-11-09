package starter;

public enum EnemyType {
GOBLIN, SLIME, BOSS, CHEST;
	public String toString() {
		switch (this) {
		case GOBLIN: return "goblin";
		case SLIME: return "slime";
		case BOSS: return "boss";
		case CHEST: return "chest";
		}
		return "n/a";
	}
}
