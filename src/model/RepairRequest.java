package model;

public class RepairRequest {
	String serviceID;
	String customerID;
	int productType;
	String machineBrand;
	String machineType;
	String serialNumber;
	String lackPart;
	String machineFailPhenomena;
	String machineAttachCheck;
	String passWord;
	String importantInfo;
	String HDD;
	String internalStorage;
	int failType;
	String outPCCard;
	String ACAdapter;
	String battery;
	String externalCDROM;
	String externalSoftDrive;
	String others;
	String repairTime;
	int estimatedPrice;
	int repairState;
	public String getServiceID() {
		return serviceID;
	}
	public void setServiceID(String serviceID) {
		this.serviceID = serviceID;
	}
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public int getProductType() {
		return productType;
	}
	public void setProductType(int productType) {
		this.productType = productType;
	}
	public String getMachineBrand() {
		return machineBrand;
	}
	public void setMachineBrand(String machineBrand) {
		this.machineBrand = machineBrand;
	}
	public String getMachineType() {
		return machineType;
	}
	public void setMachineType(String machineType) {
		this.machineType = machineType;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getLackPart() {
		return lackPart;
	}
	public void setLackPart(String lackPart) {
		this.lackPart = lackPart;
	}
	public String getMachineFailPhenomena() {
		return machineFailPhenomena;
	}
	public void setMachineFailPhenomena(String machineFailPhenomena) {
		this.machineFailPhenomena = machineFailPhenomena;
	}
	public String getMachineAttachCheck() {
		return machineAttachCheck;
	}
	public void setMachineAttachCheck(String machineAttachCheck) {
		this.machineAttachCheck = machineAttachCheck;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getImportantInfo() {
		return importantInfo;
	}
	public void setImportantInfo(String importantInfo) {
		this.importantInfo = importantInfo;
	}
	public String getHDD() {
		return HDD;
	}
	public void setHDD(String hDD) {
		HDD = hDD;
	}
	public String getInternalStorage() {
		return internalStorage;
	}
	public void setInternalStorage(String internalStorage) {
		this.internalStorage = internalStorage;
	}
	public int getFailType() {
		return failType;
	}
	public void setFailType(int failType) {
		this.failType = failType;
	}
	public String getOutPCCard() {
		return outPCCard;
	}
	public void setOutPCCard(String outPCCard) {
		this.outPCCard = outPCCard;
	}
	public String getACAdapter() {
		return ACAdapter;
	}
	public void setACAdapter(String aCAdapter) {
		ACAdapter = aCAdapter;
	}
	public String getBattery() {
		return battery;
	}
	public void setBattery(String battery) {
		this.battery = battery;
	}
	public String getExternalCDROM() {
		return externalCDROM;
	}
	public void setExternalCDROM(String externalCDROM) {
		this.externalCDROM = externalCDROM;
	}
	public String getExternalSoftDrive() {
		return externalSoftDrive;
	}
	public void setExternalSoftDrive(String externalSoftDrive) {
		this.externalSoftDrive = externalSoftDrive;
	}
	public String getOthers() {
		return others;
	}
	public void setOthers(String others) {
		this.others = others;
	}
	public String getRepairTime() {
		return repairTime;
	}
	public void setRepairTime(String repairTime) {
		this.repairTime = repairTime;
	}
	public int getEstimatedPrice() {
		return estimatedPrice;
	}
	public void setEstimatedPrice(int estimatedPrice) {
		this.estimatedPrice = estimatedPrice;
	}
	public int getRepairState() {
		return repairState;
	}
	public void setRepairState(int repairState) {
		this.repairState = repairState;
	}
	public RepairRequest(String serviceID, String customerID, int productType,
			String machineBrand, String machineType, String serialNumber,
			String lackPart, String machineFailPhenomena,
			String machineAttachCheck, String passWord, String importantInfo,
			String hDD, String internalStorage, int failType, String outPCCard,
			String aCAdapter, String battery, String externalCDROM,
			String externalSoftDrive, String others, String repairTime,
			int estimatedPrice, int repairState) {
		super();
		this.serviceID = serviceID;
		this.customerID = customerID;
		this.productType = productType;
		this.machineBrand = machineBrand;
		this.machineType = machineType;
		this.serialNumber = serialNumber;
		this.lackPart = lackPart;
		this.machineFailPhenomena = machineFailPhenomena;
		this.machineAttachCheck = machineAttachCheck;
		this.passWord = passWord;
		this.importantInfo = importantInfo;
		HDD = hDD;
		this.internalStorage = internalStorage;
		this.failType = failType;
		this.outPCCard = outPCCard;
		ACAdapter = aCAdapter;
		this.battery = battery;
		this.externalCDROM = externalCDROM;
		this.externalSoftDrive = externalSoftDrive;
		this.others = others;
		this.repairTime = repairTime;
		this.estimatedPrice = estimatedPrice;
		this.repairState = repairState;
	}
}
