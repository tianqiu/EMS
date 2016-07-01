package model;

public class Part {
	String partName;
	String type;
	int price;
	int num;
	String date;
	int warnNum;
	int inventoryState;
	
	
	public Part(String partName, String type, int price, int num, String date,
			int warnNum, int inventoryState) {
		super();
		this.partName = partName;
		this.type = type;
		this.price = price;
		this.num = num;
		this.date = date;
		this.warnNum = warnNum;
		this.inventoryState = inventoryState;
	}


	public String getPartName() {
		return partName;
	}


	public void setPartName(String partName) {
		this.partName = partName;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public int getWarnNum() {
		return warnNum;
	}


	public void setWarnNum(int warnNum) {
		this.warnNum = warnNum;
	}


	public int getInventoryState() {
		return inventoryState;
	}


	public void setInventoryState(int inventoryState) {
		this.inventoryState = inventoryState;
	}
	
	

}
