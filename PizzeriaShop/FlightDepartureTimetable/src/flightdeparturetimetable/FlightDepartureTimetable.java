package flightdeparturetimetable;
import java.awt.Image;
import javax.swing.ImageIcon;
/**
 *
 * @author Ion
 */
public class FlightDepartureTimetable {
    public static void main(String[] args) {
        FlightDepartureTimetableGUI f = new FlightDepartureTimetableGUI();
        f.setTitle("Flight Departure Timetable");
        
        ImageIcon img = new ImageIcon("logo.png");
        f.setIconImage(img.getImage());
        
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
    } 
}
