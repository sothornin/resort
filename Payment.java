class Payment{
	private String paymentType;
	private double price;
	private double tax;
	private String customerName;
	private int roomNum;
	private String roomType;
	private int nights;

	private Room room;
//	private NormalRoom nroom;
//	private FamilyRoom froom;

	Payment(Room room){
		setRoom(room);
		setCustomerName();
		setPrice();
		setRoomType();
		setRoomNum();
		setNights();
	}

	double getPrice() {
		return price;
	}

	double getTax() {
		return tax;
	}

	int getNights() {
		return nights;
	}

	int getRoomNum() {
		return roomNum;
	}

	String getCustomerName() {
		return customerName;
	}

	String getRoomType() {
		return roomType;
	}

	private void setNights() {
		this.nights = room.getNight();
	}

	private void setRoomType() {
		this.roomType = room.getRoomType();
	}

	private void setRoomNum() {
		this.roomNum = room.getRoomNum();
	}

	private void setRoom(Room room) {
		this.room = room;
	}


	private void setCustomerName() {
		this.customerName = room.getName();
	}

	void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}



	private void setPrice() {
		this.price = room.getRoomPrice() * room.getNight();
		this.tax = price - (price / 1.07);
	}

	String getPaymentType() {
		return paymentType;
	}

	void printInvoice(){

		System.out.println("==========INVOICE==========");
		System.out.println("Customer Name: " + this.customerName);
		System.out.println("Room Number: " + this.roomNum);
		System.out.println("Room Type: " + this.roomType);
		System.out.println("Price(tax included): " + this.price);
		System.out.println("Tax: " + String.format("%,.2f", this.tax));
		System.out.println("Payment Method: " + this.paymentType);
		System.out.println("===========================");

	}
}