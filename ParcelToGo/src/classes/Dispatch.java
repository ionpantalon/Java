package classes;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ion Pantalon
 */
public class Dispatch {

    //add a new slip to the table
    public void addNewOrder() {
        Slip s = new Slip();
        DefaultTableModel model = (DefaultTableModel) ParcelToGo.table.getModel();
        model.addRow(new Object[]{s.getItem(), s.getSource(), s.getDestination()});
    }

    //move a slip up
    public void moveUp() {
        DefaultTableModel model = (DefaultTableModel) ParcelToGo.table.getModel();
        int[] rows = ParcelToGo.table.getSelectedRows();
        model.moveRow(rows[0], rows[rows.length - 1], rows[0] - 1);
        ParcelToGo.table.setRowSelectionInterval(rows[0] - 1, rows[rows.length - 1] - 1);
    }

    //move a slip down
    public void moveDown() {
        DefaultTableModel model = (DefaultTableModel) ParcelToGo.table.getModel();
        int[] rows = ParcelToGo.table.getSelectedRows();
        model.moveRow(rows[0], rows[rows.length - 1], rows[0] + 1);
        ParcelToGo.table.setRowSelectionInterval(rows[0] + 1, rows[rows.length - 1] + 1);
    }

    //delete a slip
    public void delete() {
        DefaultTableModel model = (DefaultTableModel) ParcelToGo.table.getModel();
        int selRow = ParcelToGo.table.getSelectedRow();
        if (selRow != -1) {
            model.removeRow(selRow);
        }
    }
}
