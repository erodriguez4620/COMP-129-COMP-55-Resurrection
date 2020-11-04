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
}