/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dataserver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Xiong Zhan Yi
 */
public class AdministratorDAO {
    private Connection getConnection() throws SQLException, ClassNotFoundException {
        Connection connect = null;
        String url = "jdbc:mysql://localhost:3306/FortuneWheelGame";
        String username = "root";
        String password = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection(url, username, password);
        } catch (SQLException ex) {
            throw new SQLException(ex);
        }
        return connect;
    }
    
    public boolean isAdministrator(String name, String password) throws SQLException, ClassNotFoundException{
        try{
            Connection con = getConnection();
            if(con == null){
                throw new SQLException("Connection == null");
            }
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM `administrator`;");
            while(rs.next()){
                if(rs.getString("username").equals(name) && rs.getString("password").equals(password)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            throw new SQLException(ex);
        }
        return false;
    }
}
