package starter;

public enum ItemType {
	WEAPON, POTION, KEY;
	
	public String toString() {
		switch(this) {
			case WEAPON: return "weapon";
			case POTION: return "potion";
			case KEY: return "key";
		}
		return "n/a";
	}
	
}
