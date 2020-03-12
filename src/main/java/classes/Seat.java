package classes;

public class Seat {
    private static String cName;
    private static String cNIC;
    private static boolean isBooked;
    private static int seatNum;

    Seat(int num){
        isBooked = false;
        seatNum = num;
    }

    public static void assignCustomer(String Name,String NIC){
        cName = Name;
        cNIC = NIC;
        isBooked = true;
    }
}
