/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package payroll;
import java.sql.*;
import java.sql.SQLException;

/**
 *
 * @author biaco
 */
public class SQLiteConnection{
    private static final String DATABASE_URL = "jdbc:sqlite:.//database//Payroll.sqlite";
    private static Connection connection;
    
    public static Connection getConnection(){
        if(connection == null){
            try{
               Class.forName("org.sqlite.JDBC");
               connection = DriverManager.getConnection(DATABASE_URL);
               System.out.println("Connected to SQLite Database");
            }catch(ClassNotFoundException | SQLException e){
               e.printStackTrace();
            }
        }
            return connection; 
    }
    
    
    public static void closeConnection(){
        if(connection != null){
            try{
                connection.close();
                System.out.println("Disconnected from SQLite Datase");
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
    }
}
