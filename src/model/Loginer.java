package model;

public class Loginer {
	String loginID;
	String password;
	int type;//0是客服，1是技工
	int state;//0是闲置，1是忙碌
	
	public Loginer(String loginID, String password, int type, int state) {
		super();
		this.loginID = loginID;
		this.password = password;
		this.type = type;
		this.state = state;
	}
	
	public String getLoginID() {
		return loginID;
	}
	public void setLoginID(String loginID) {
		loginID = loginID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
}
