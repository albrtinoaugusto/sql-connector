
package Application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author Albertino Augusto */

public class Connector 
{

    public Connection getConnection()
    {
    
        Connection conn = null;
//        
//        if(ip != null && database != null && username != null && !ip.equals("") && !database.equals("") && !username.equals(""))
//        {
            try
            {            
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/stock_manager", "root", "");
//                conn = DriverManager.getConnection("jdbc:mysql://" + ip + ":" + port + "/" + database, username, password); 
            }       
            catch(ClassNotFoundException | SQLException e) 
            {
                JOptionPane.showMessageDialog(null, "Error: \n" + e, null, JOptionPane.ERROR_MESSAGE);
            } 
//        }
        return conn;
    }
}
