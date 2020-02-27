class FamilyRoom extends Room {
	private static int fNumOfRoom;

	FamilyRoom(){
		this.setRoomType("Family Room");
		this.setRoomPrice(1500);
		fNumOfRoom++;
		this.roomNum = fNumOfRoom;
	}

}