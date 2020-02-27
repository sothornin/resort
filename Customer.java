class Customer{
	String customerName = "None";
	NormalRoom nroom;
	FamilyRoom froom;
	Customer(){}
	Customer(String customerName, int roomNum, NormalRoom n){
		setName(customerName);
		this.nroom.roomNum = roomNum;
	}

	public void setName(String customerName){
		this.customerName = customerName;
	}
	public String getName(){
		return this.customerName;
	}

}