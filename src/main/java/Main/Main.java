package Main;
import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/*
    A - add customer
    V - view all seats
    E - empty seats
    F - find the seats for given customer name
    S - store program data
    L - load program data
    O - sort
    Q - exit
 */
public class Main extends Application {
    private static final int SEATING_CAPACITY = 42;

    public static void main(String[] args) {
        Map<Integer,Seat> seatCollection = new HashMap<Integer, Seat>();
        initializeSeatCollection(seatCollection);
        int launchCount = 0;
        Scanner scn = new Scanner(System.in);
        char menuSelection;
        do {
            System.out.println("Select an Option");
            menuSelection = getSelection(scn);
            switch (menuSelection){
                case 'A':
                    if (launchCount == 0){
                        launch();
                        addCustomerUI();
                        launchCount++;
                    }else{
                        addCustomerUI();
                    }
                    System.out.print("Enter Customer Name:");
                    String cName = scn.next();
                    System.out.print("Enter NIC:");
                    String cNIC = scn.next();
                    int seatNum = scn.nextInt();
                    addCustomer(cName,cNIC,seatNum,seatCollection);
                    System.out.println(seatCollection.get(5).getcName());
                    break;
                case 'V':
                    //
                    break;
                case 'E':
                    //empty
                    break;
                case'F':
                    System.out.println(findSeat("Seniya",seatCollection));

                    //find
                    break;

                case 'S':
                    //store
                    break;
                case 'L':
                    //load
                    break;
                case 'O':
                    //sort
                    break;
            }
        }while (menuSelection != 'Q');

    }

    private static  void addCustomerUI(){
        Stage addCustomer = new Stage();
        Button btnnew = new Button("Hello");
        addCustomer.setScene(new Scene(btnnew,500,500));
        addCustomer.show();
    }

    private static void initializeSeatCollection(Map<Integer,Seat> seatCollection){
        for( int i =0 ;i< SEATING_CAPACITY;i++){
            seatCollection.put(i,new Seat(i));
        }
    }

    private static char getSelection(Scanner scn){
        char input = scn.next().charAt(0);
        return Character.toUpperCase(input);
    }

    public static void addCustomer(String cName, String cNIC,int seatNum,Map<Integer,Seat> seatCollection){

        if(!seatCollection.get(seatNum).isIsBooked()){
//            s.assignCustomer(cName,cNIC);
            seatCollection.get(seatNum).assignCustomer(cName,cNIC);
        }
    }

    public static Integer findSeat(String cName,Map<Integer,Seat> seatCollection){
        for (Map.Entry<Integer,Seat> entry:seatCollection.entrySet()) {
            if (entry.getValue().getcName()!=null && entry.getValue().getcName().equals(cName)){
                return  entry.getKey();
            }
        }
        return 0;

    }

    @Override
    public void start(Stage stage) throws Exception {
        addCustomerUI();
//        FlowPane fp = new FlowPane();
//
//        Label btnnew = new Label();
//        btnnew.setText("iofdis");
//        fp.getChildren().add((Node) btnnew);
//        stage.setScene(new Scene(fp,500,500));
//        stage.show();
    }
}
