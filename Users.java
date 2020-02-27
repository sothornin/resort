import java.util.Scanner;

class Users {
	private String name;
	private  int age;
	private int iD;
	private char uType;

	void setuType(char uType) {
		this.uType = uType;
	}

	void checkAva(Room[] room){
		for (int i = 0; i < NormalRoom.nNumOfRoom ; i++ ) {
			System.out.print("Room " + (i + 1) +" " + "Customer Name = " + room[i].getName() + "\t");
			room[i].showAva();
		}
	}
	void checkOut(Scanner scanner, Room[] room){
		System.out.println("Enter Room number: ");
		int roomNum = scanner.nextInt();
		room[roomNum - 1].checkOut();
	}
	void checkIn(Scanner scanner, Room[] room, Payment[] pay, Customer[] customer, int c, int p){
		int roomNum;
		while(true){
			System.out.println("Enter Room number(1-5): ");
			roomNum = scanner.nextInt();
			if (roomNum <= 5) {
				if (room[roomNum-1].getRoomAva())
					break;
				else System.out.println("Room not available!!");
			}
		}

		if (room[roomNum - 1].getRoomAva()){
			System.out.print("Enter Customer Name: ");
			scanner.nextLine();
			String customerName = scanner.nextLine();
			System.out.print("Enter Number of Night: ");
			int numberOfNight = scanner.nextInt();

			customer[c].setName(customerName);
			room[roomNum - 1].setCustomer(customer[c]);
			room[roomNum - 1].setNight(numberOfNight);
			pay[p] = new Payment(room[roomNum-1]);
			while (true) {
				System.out.println("Payment method\n1. Credit Card\n2. Cash");
				int but = scanner.nextInt();
				if (but == 1){
					pay[p].setPaymentType("Credit Card");
					break;
				} else if (but == 2){
					pay[p].setPaymentType("Cash");
					break;
				} else continue;
			}
			pay[p].printInvoice();
			room[roomNum - 1].checkIn();
		} else System.out.println("Room not available");
	}
}