package classes;
/**
 *
 * @author Ion Pantalon
 */
public class DisplayQueue {

    //creating card Type array and initialize the status variable
    public static String cardType[] = {"Normal passenger.",
        "Passenger with infants or small children.",
        "Priority passenger.",
        "Passenger needing assistance."};
    public static int status;

    //display all the passengers method
    public static void displayAllPassengers() {
        for (int i = 1; i < EnQueue.list.size(); i++) {
            status = (int) Math.round(Math.random() * 50);
            EnQueue.list.set(i, status);
            
                if (status >= 1 && status <= 3) {
                    status = 3;
                    System.out.println(i + "-" + cardType[3]);
                } else if (status >= 4 && status <= 20) {
                    status = 2;
                    System.out.println(i + "-" + cardType[2]);
                } else if (status >= 21 && status <= 30) {
                    status = 1;
                    System.out.println(i + "-" + cardType[1]);
                } else {
                    status = 0;
                    System.out.println(i + "-" + cardType[0]);
                }
            
        }
    }//displayAllPassengers method ends

    //display indidviduals passengers method
    public static void displayQueueIndividual() {
        for (int i = 1; i < EnQueue.list.size(); i++) {
            status = (int) Math.round(Math.random() * 50);
            EnQueue.list.set(i, status);
            if (Global.passengerNumber == i) {
                if (status >= 1 && status <= 3) {
                    status = 3;
                    System.out.println(i + "-" + cardType[3]);
                } else if (status >= 4 && status <= 20) {
                    status = 2;
                    System.out.println(i + "-" + cardType[2]);
                } else if (status >= 21 && status <= 30) {
                    status = 1;
                    System.out.println(i + "-" + cardType[1]);
                } else {
                    status = 0;
                    System.out.println(i + "-" + cardType[0]);
                }
            }
        }
    }//displayQueueIndividual method ends
}//DeQueue class ends
