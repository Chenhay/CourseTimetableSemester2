package Event;

import form.Signin;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Connect_db {
    public static Connection con;
    public static Statement stm;
    
    public static Connection getConnection(){
        if (con == null) {
            try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            System.out.println("Have driver!");
            String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=CourseTimetable";
            String user = "seakleang";
            String password = "NhAkSLsl^^98";
            con = DriverManager.getConnection(dbURL, user, password);
            System.out.println("Connect Success!");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Signin.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Signin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return con;
    }
    
    public static Statement getStatement(){
        if (stm == null) {
            try {
                stm = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            } catch (SQLException ex) {
                Logger.getLogger(Connect_db.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return stm;
    }
}
