package pizzeriashop;

import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Ion Pantalon
 */
public class db {
    Connection conn = null;

    //create a static method ConnectDb
    public static Connection ConnectDb() {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:pizzaDatabase.sqlite");
            //D:\\college\\second year\\college_work_1_sem\\FDC21-OOP_group\\PizzeriaShop\\src\\pizzeriashop\\pizzaDatabase.sqlite
            //  JOptionPane.showMessageDialog(null, "Connection Established");
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
