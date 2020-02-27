class Room {
	private static int numOfRoom;
	int roomNum;
	private int roomPrice;
	private String roomType;
	private boolean roomAva = true;
	private Customer c = new Customer();
	private int night;
	Room(){
		numOfRoom++;
		this.roomNum = numOfRoom;
	}
	String getName(){
		return this.c.customerName;
	}
	void setCustomer(Customer c){
		this.c = c;
	}


	boolean getRoomAva(){
		return roomAva;
	}

	void checkIn(){
		this.roomAva = false;
		System.out.println("Check in Complete");
	}



	void checkOut(){
		if(this.roomAva) {
			System.out.println("Room Empty");
		} else {
			this.roomAva = true;
			this.c.setName("None");
			System.out.println("Check Out Complete");
		}
	}

	void showAva(){
		if (roomAva)
			System.out.print("Available.\n");
		else 
			System.out.print("Unavailable.\n");
	}

	int getRoomNum(){
		return this.roomNum;
	}

	int getRoomPrice(){
		return this.roomPrice;
	}
	String getRoomType(){
		return this.roomType;
	}

	void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	void setRoomPrice(int roomPrice) {
		this.roomPrice = roomPrice;
	}

	void setNight(int night) {
		this.night = night;
	}

	int getNight() {
		return night;
	}
}