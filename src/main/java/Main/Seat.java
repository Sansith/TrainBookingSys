package Main;

public class Seat {
    public String cName;
    public String cNIC;
    public boolean isBooked;
    public int seatNum;

    Seat(int num) {
        isBooked = false;
        seatNum = num;
    }

    public boolean isIsBooked() {
        return isBooked;
    }

    public String getcName() {
        return cName;
    }

    public int getSeatNum() {
        return seatNum;
    }

    public void assignCustomer(String Name, String NIC) {
        cName = Name;
        cNIC = NIC;
        isBooked = true;
    }
}
