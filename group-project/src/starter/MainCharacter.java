package starter;

public class MainCharacter {
	public int playerHP; //player's HP
	private ItemType item; //what item the player is holding
	Space player; //where the player will be
	
	
	 public MainCharacter(ItemType item, int playerHP, Space player) {
		this.item = item;
		this.playerHP = playerHP;
		this.player = player;
	}

	//Getters
	public int getPlayerHP() {
		return playerHP;
	}

	public ItemType getItem() {
		return item;
	}
	
	public Space getPlayer() {
		return player;
	}

	
	//Setters
	public void setPlayerHP(int playerHP) {
		this.playerHP = playerHP;
	}
	
	public void setItem(ItemType item) {
		this.item = item;
	}

	public void setPlayer(Space player) {
		this.player = player;
	}
	
	
}