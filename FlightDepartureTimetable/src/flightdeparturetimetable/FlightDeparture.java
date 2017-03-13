package flightdeparturetimetable;

import static flightdeparturetimetable.FlightDepartureTimetableGUI.search_destination;
import static flightdeparturetimetable.FlightDepartureTimetableGUI.table_flights;
import static flightdeparturetimetable.InsertNew.destination_txt;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Ion
 */
public class FlightDeparture {

    //insert new flights into the table method
    public static void InsertFlight() {
        if (InsertNew.destination_txt.getText().equals("")) {
            InsertNew.label_dest.setVisible(true);
        } else {
            DefaultTableModel model = (DefaultTableModel) FlightDepartureTimetableGUI.table_flights.getModel();
            String time = InsertNew.time_txt_H.getSelectedItem() + ":" + InsertNew.time_txt_M.getSelectedItem();
            String destination = InsertNew.destination_txt.getText();
            String[] arrayItems = new String[]{time, destination};
            
            TableColumn column = FlightDepartureTimetableGUI.table_flights.getColumnModel().getColumn(2);
            JComboBox comboBox = new JComboBox();
            comboBox.addItem("Postponed");
            comboBox.addItem("Rescheduled");
            comboBox.addItem("Canceled");
            comboBox.addItem("On time");
            column.setCellEditor(new DefaultCellEditor(comboBox)); 
            model.insertRow(0, new Object[]{arrayItems[0], arrayItems[1],"On time"});
                

        }
    }

    //delete flight method
    public static void DeleteFlight() {
        DefaultTableModel model = (DefaultTableModel) table_flights.getModel();
        int selRow = table_flights.getSelectedRow();
        if (selRow != -1) {
            model.removeRow(selRow);
        }
    }

    //search by time method
    public static void SearchByTime() {
        DefaultTableModel model = (DefaultTableModel) table_flights.getModel();
        final TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(model);
        table_flights.setRowSorter(sorter);

        String text = FlightDepartureTimetableGUI.search_time.getText();
        if (text.length() == 0) {
            sorter.setRowFilter(null);
        } else {
            sorter.setRowFilter(RowFilter.regexFilter(text));
        }
    }

    //search by destination method
    public static void SearchByDestination() {
        DefaultTableModel model = (DefaultTableModel) table_flights.getModel();
        final TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(model);
        table_flights.setRowSorter(sorter);

        String text = FlightDepartureTimetableGUI.search_destination.getText();
        if (text.length() == 0) {
            sorter.setRowFilter(null);
        } else {
            sorter.setRowFilter(RowFilter.regexFilter(text));
        }
    }
    
 
}
