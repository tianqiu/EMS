package model;

public class Checkout {
	String serviceID;
	int serviceCost;
	int materialCost;
	String serviceCommitment;
	String caution;
	String endDate;

	public Checkout(String serviceID, int serviceCost, int materialCost,
			String serviceCommitment, String caution, String endDate) {
		super();
		this.serviceID = serviceID;
		this.serviceCost = serviceCost;
		this.materialCost = materialCost;
		this.serviceCommitment = serviceCommitment;
		this.caution = caution;
		this.endDate = endDate;
	}
	
	public String getServiceID() {
		return serviceID;
	}
	public void setServiceID(String serviceID) {
		this.serviceID = serviceID;
	}
	public int getServiceCost() {
		return serviceCost;
	}
	public void setServiceCost(int serviceCost) {
		this.serviceCost = serviceCost;
	}
	public int getMaterialCost() {
		return materialCost;
	}
	public void setMaterialCost(int materialCost) {
		this.materialCost = materialCost;
	}
	public String getServiceCommitment() {
		return serviceCommitment;
	}
	public void setServiceCommitment(String serviceCommitment) {
		this.serviceCommitment = serviceCommitment;
	}
	public String getCaution() {
		return caution;
	}
	public void setCaution(String caution) {
		this.caution = caution;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	

}
