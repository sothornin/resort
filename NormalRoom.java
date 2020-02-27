class NormalRoom extends Room{
	static int nNumOfRoom;

	NormalRoom(){
		this.setRoomType("Normal Room");
		this.setRoomPrice(900);
		nNumOfRoom++;
		this.roomNum = nNumOfRoom;
	}

}