package model;

public class RepairList {
	String serviceID;
	String worker;
	String inspectionRecord;
	String serviceRecord;
	String serviceTime;
	String workLoad;
	String neededPart;
	int serviceState;
	
	
	public RepairList(String serviceID, String worker, String inspectionRecord,
			String serviceRecord, String serviceTime, String workLoad,
			String neededPart, int serviceState) {
		super();
		this.serviceID = serviceID;
		this.worker = worker;
		this.inspectionRecord = inspectionRecord;
		this.serviceRecord = serviceRecord;
		this.serviceTime = serviceTime;
		this.workLoad = workLoad;
		this.neededPart = neededPart;
		this.serviceState = serviceState;
	}


	public String getServiceID() {
		return serviceID;
	}


	public void setServiceID(String serviceID) {
		this.serviceID = serviceID;
	}


	public String getWorker() {
		return worker;
	}


	public void setWorker(String worker) {
		this.worker = worker;
	}


	public String getInspectionRecord() {
		return inspectionRecord;
	}


	public void setInspectionRecord(String inspectionRecord) {
		this.inspectionRecord = inspectionRecord;
	}


	public String getServiceRecord() {
		return serviceRecord;
	}


	public void setServiceRecord(String serviceRecord) {
		this.serviceRecord = serviceRecord;
	}


	public String getServiceTime() {
		return serviceTime;
	}


	public void setServiceTime(String serviceTime) {
		this.serviceTime = serviceTime;
	}


	public String getWorkLoad() {
		return workLoad;
	}


	public void setWorkLoad(String workLoad) {
		this.workLoad = workLoad;
	}


	public String getNeededPart() {
		return neededPart;
	}


	public void setNeededPart(String neededPart) {
		this.neededPart = neededPart;
	}


	public int getServiceState() {
		return serviceState;
	}


	public void setServiceState(int serviceState) {
		this.serviceState = serviceState;
	}
	
	
	
	
	
	
	
	

}
