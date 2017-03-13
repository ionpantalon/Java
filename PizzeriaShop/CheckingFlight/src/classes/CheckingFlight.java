package classes;
import java.util.Scanner;

/**
 *
 * @author Ion Pantalon
 */
public class CheckingFlight {

    //main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //ask the user for the number of passengers
        System.out.print("How many passengers are in the queue? ");
        String read = input.next();
        Global.numberOfPassenger = Integer.parseInt(read);

        //call the create Queue method
        EnQueue.createQueue();

        //ask the user to choose between displaying all the passengers or individual passengers
        System.out.print("Type 0 to see all the passengers or 1 to see invidual passengers: ");
        String read2 = input.next();
        int answer = Integer.parseInt(read2);

            //if the user presses 0 display all the passengers,
            if (answer == 0) {
                System.out.println("\nDisplaying all passengers..");
                DisplayQueue.displayAllPassengers();
                //if the user presses 1 ask to enter the passenger's number
            } else if (answer == 1) {
                int t = 2;
                while (t > answer) {                
                    System.out.print("Type a passenger number: ");
                    String read3 = input.next();
                    Global.passengerNumber = Integer.parseInt(read3);
                    //display the passenger that has the specific number
                    System.out.println("\nDisplaying the passenger..");
                    DisplayQueue.displayQueueIndividual();
                    System.out.println();
                t++;
                }      
            }
    }//main method ends
}//CheckingFlights class ends

   
