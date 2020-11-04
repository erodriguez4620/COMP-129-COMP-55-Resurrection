package starter;

public enum EnemyType {
GOBLIN, SLIME, BOSS;
	public String toString() {
		switch (this) {
		case GOBLIN: return "goblin";
		case SLIME: return "slime";
		case BOSS: return "boss";
		}
		return "n/a";
	}
}
