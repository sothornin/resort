import java.util.*;
class Resort {
	public static void main(String[] args) {
		int button = -1;
		int button2;
		int c = 0;
		int p = 0;
		Manager m = new Manager();
		Employee e = new Employee();
		NormalRoom[] nroom = new NormalRoom[5];
		FamilyRoom[] froom = new FamilyRoom[5];
		Payment[] pay = new Payment[1000];
		Scanner scanner = new Scanner(System.in);
		Customer[] customer = new Customer[1000];
		for (int i = 0; i < 5; i++) {
			nroom[i] = new NormalRoom();
		}
		for (int i = 0; i < 5; i++) {
			froom[i] = new FamilyRoom();
		}
		for (int i = 0; i < 100; i++) {
			customer[i] = new Customer();
		}
		while(true){
			System.out.println("++++++++++++++++++++");
			System.out.println("||BAAN WHAN RESORT||");
			System.out.println("++++++++++++++++++++");
			System.out.println("Are you\n1. Manager\n2. Employee\nOther numbers to EXIT");
			button2 = scanner.nextInt();



			if (button2 == 1) {
				int pass;
				System.out.println("Enter Password: "); //default pass = "123456"
				pass = scanner.nextInt();
				if (pass != m.getPassword()) {
					System.out.println("Wrong Passoword!!!!!");
					continue;
				}

				while (true) {
					System.out.println("1. Show Availability\n2. Check in\n3. Check out\n4. Show Report\n5. Change Password\n0. Log out");
					button = scanner.nextInt();
					if (button == 1) {
						System.out.println("1. Normal Room\n2. Family Room");
						int button1 = scanner.nextInt();
						if (button1 == 1) {
							m.checkAva(nroom);
						} else if (button1 == 2) {
							m.checkAva(froom);
						}
					} else if (button == 2) {
						System.out.println("1. Normal Room\n2. Family Room");
						int button1 = scanner.nextInt();
						if (button1 == 1) {
							m.checkIn(scanner, nroom, pay, customer, c, p);
							c++;
							p++;
						} else if (button1 == 2) {
							m.checkIn(scanner, froom, pay, customer, c, p);
							c++;
							p++;
						}
					} else if (button == 3) {
						System.out.println("1. Normal Room\n2. Family Room");
						int button1 = scanner.nextInt();
						if (button1 == 1) {
							m.checkOut(scanner, nroom);
						} else if (button1 == 2) {
							m.checkOut(scanner, froom);
						}
					} else if (button == 4) {
						m.viewReport(pay, p);
					} else if (button == 5) {
						while(true) {
							System.out.print("Enter new Password (6 digits number): ");
							int pas = scanner.nextInt();
							if(pas < 1000000) {
								m.setPassword(pas);
								break;
							}
						}
					} else if (button == 0){
						break;
					} else System.out.println("Enter again!!");
				}
			} else if (button2 == 2){
				while (true) {
					System.out.println("1. Show Availability\n2. Check in\n3. Check out\n0. Log out");
					button = scanner.nextInt();
					if (button == 1) {
						System.out.println("1. Normal Room\n2. Family Room");
						int button1 = scanner.nextInt();
						if (button1 == 1) {
							e.checkAva(nroom);
						} else if (button1 == 2) {
							e.checkAva(froom);
						}
					} else if (button == 2) {
						System.out.println("1. Normal Room\n2. Family Room");
						int button1 = scanner.nextInt();
						if (button1 == 1) {
							e.checkIn(scanner, nroom, pay, customer, c, p);
							c++;
							p++;
						} else if (button1 == 2) {
							e.checkIn(scanner, froom, pay, customer, c, p);
							c++;
							p++;
						}
					} else if (button == 3) {
						System.out.println("1. Normal Room\n2. Family Room");
						int button1 = scanner.nextInt();
						if (button1 == 1) {
							e.checkOut(scanner, nroom);
						} else if (button1 == 2) {
							e.checkOut(scanner, froom);
						}
					} else if (button == 0){
						break;
					} else System.out.println("Enter again!!");
				}
			} else {
				System.out.println("GoodBye");
				break;
			}
		}
	}
}
