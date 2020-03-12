package Main;

import classes.Seat;
import javafx.application.Application;
import javafx.stage.Stage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main extends Application {
    private static final int SEATING_CAPACITY = 42;
    Map<Integer, Seat> seatCollection = new HashMap<Integer,Seat>();

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char menuSelection = scn.nextLine().charAt(0);
        switch (menuSelection){
            case 'A':
                break;
            case 'V':

        }
    }

    @Override
    public void start(Stage stage) throws Exception {

    }
}
