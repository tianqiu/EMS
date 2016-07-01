package model;

public class PartTrack {
	String partName;
	int inOut;
	String type;
	String serviceID;
	int num;
	int price;
	String deliveryTime;
	
	
	public PartTrack(String partName, int inOut, String type, String serviceID,
			int num, int price, String deliveryTime) {
		super();
		this.partName = partName;
		this.inOut = inOut;
		this.type = type;
		this.serviceID = serviceID;
		this.num = num;
		this.price = price;
		this.deliveryTime = deliveryTime;
	}


	public String getPartName() {
		return partName;
	}


	public void setPartName(String partName) {
		this.partName = partName;
	}


	public int getInOut() {
		return inOut;
	}


	public void setInOut(int inOut) {
		this.inOut = inOut;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getServiceID() {
		return serviceID;
	}


	public void setServiceID(String serviceID) {
		this.serviceID = serviceID;
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getDeliveryTime() {
		return deliveryTime;
	}


	public void setDeliveryTime(String deliveryTime) {
		this.deliveryTime = deliveryTime;
	}
	
	
	
	
	
	
	
	

}
