package classes;
import java.util.ArrayList;
/**
 *
 * @author Ion Pantalon
 */
public class EnQueue {
    //create the ArrayList list
    public static ArrayList list;

    //create Queue method 
    public static void createQueue() {
        list = new ArrayList();
        for (int x = 1; x <= Global.numberOfPassenger+1; x++) {
            list.add(x);
        }
    }//createQueue method ends
}//EnQueue class ends
