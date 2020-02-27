class Manager extends Users {
    private int password = 123456;
    Manager(){
        this.setuType('m');
    }

    void setPassword(int password) {
        this.password = password;
    }

    int getPassword() {
        return password;
    }

    void viewReport(Payment[] pay, int p){
        System.out.println("===================================REPORT==========================================");
        System.out.println("CustName\tPrice\t\tRoomNum\t\tRoomType\t\tNights\t\tTax\t\tMethod");
        for (int i = 0; i < p; i++){
            //System.out.println("", pay[i].customerName + "\t" + pay[i].price + "\t" + pay[i].roomNum + "\t\t\t\t" + pay[i].roomType + "\t\t");
            System.out.printf("%-10s\t%.2f\t\t%d%-5s\t\t%-10s\t\t%d\t%-8s%.2f\t%s\n", pay[i].getCustomerName(), pay[i].getPrice(), pay[i].getRoomNum(), " ", pay[i].getRoomType(), pay[i].getNights(), " ", pay[i].getTax(), pay[i].getPaymentType() );
        }
        System.out.println("===================================================================================");
    }

}
