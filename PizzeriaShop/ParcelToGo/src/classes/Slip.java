package classes;

public class Slip {

    //initalize the variable
    public static String item;
    public static String source;
    public static String destination;

    //set default constructor
    public Slip() {

    }

    //set new constructor to 3 string parameters
    public Slip(String item, String source, String destination) {
        setItem(item);
        setSource(source);
        setDestination(destination);
    }

    //set Item method
    public static void setItem(String item) {
        Slip.item = item;
    }

    //get Item method
    public String getItem() {
        return item;
    }

    //set source method
    public static void setSource(String source) {
        Slip.source = source;
    }

    //get source method
    public String getSource() {
        return source;
    }

    //set destination method
    public static void setDestination(String destination) {
        Slip.destination = destination;
    }

    //get destination method
    public String getDestination() {
        return destination;
    }

    @Override
    public String toString() {
        return "Item: " + getItem()
                + "Source: " + getSource()
                + "Destination: " + getDestination();
    }
}
