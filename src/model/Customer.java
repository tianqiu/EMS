package model;

import java.io.Serializable;

public class Customer implements Serializable {
	String customerID;
	String identificationID;
	String deliverTime;
	String customerNature;
	String fixedPhone;
	String unitName;
	String mobilePhone;
	String contacts;
	String email;
	String postCode;
	String address;
	
	public Customer(String customerID, String identificationID,
			String deliverTime, String customerNature, String fixedPhone,
			String unitName, String mobilePhone, String contacts, String email,
			String postCode, String address) {
		super();
		this.customerID = customerID;
		this.identificationID = identificationID;
		this.deliverTime = deliverTime;
		this.customerNature = customerNature;
		this.fixedPhone = fixedPhone;
		this.unitName = unitName;
		this.mobilePhone = mobilePhone;
		this.contacts = contacts;
		this.email = email;
		this.postCode = postCode;
		this.address = address;
	}
	
	
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public String getIdentificationID() {
		return identificationID;
	}
	public void setIdentificationID(String identificationID) {
		this.identificationID = identificationID;
	}
	public String getDeliverTime() {
		return deliverTime;
	}
	public void setDeliverTime(String deliverTime) {
		this.deliverTime = deliverTime;
	}
	public String getCustomerNature() {
		return customerNature;
	}
	public void setCustomerNature(String customerNature) {
		this.customerNature = customerNature;
	}
	public String getFixedPhone() {
		return fixedPhone;
	}
	public void setFixedPhone(String fixedPhone) {
		this.fixedPhone = fixedPhone;
	}
	public String getUnitName() {
		return unitName;
	}
	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}
	public String getMobilePhone() {
		return mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getPostCode() {
		return postCode;
	}


	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getContacts() {
		return contacts;
	}
	public void setContacts(String contacts) {
		this.contacts = contacts;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	

}
