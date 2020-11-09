package starter;

public class Item {
	int valuePoint; 
	ItemType itemType;
	
	public Item(ItemType itemType, int valuePoint) {
		this.itemType = itemType;
		this.valuePoint = valuePoint;
	}
	
	public String toString() {
		return itemType.toString();
	}
	
	public void setValuePoint(int valuePoint) {
		this.valuePoint = valuePoint;
	}
	
	public int getValuePoint() {
		return valuePoint;
	}
	
	//This is just to make sure the functions from the class work
	public static void main(String[] args) {
		Item item1 = new Item(ItemType.WEAPON, 2);
		Item item2 = new Item(ItemType.POTION, 5);
		Item item3 = new Item(ItemType.KEY, 0);
		System.out.println("Item Type: " + item1.toString() + " Value Point: " + item1.getValuePoint());
		System.out.println("Item Type: " + item2.toString() + " Value Point: " + item2.getValuePoint());
		System.out.println("Item Type: " + item3.toString() + " Value Point: " + item3.getValuePoint());
	}
}