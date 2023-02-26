/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dataserver;

import Applicationserver.Highscore;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
h *
 * @author Xiong Zhan Yi
 */
public class HighscoreDAO {
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
    
    public List<Highscore> getHighscoreList() throws SQLException, ClassNotFoundException{
        List<Highscore> HighscoreList = new ArrayList<>();
        try{
            Connection con = getConnection();
            if(con == null){
                throw new SQLException("Connection == null");
            }
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT name, date, moneyBalance, numberOfRounds FROM `highscore`;");
            while(rs.next()){
                HighscoreList.add(new Highscore(rs.getString("name"), rs.getDate("date"), rs.getInt("moneyBalance"), rs.getInt("numberOfRounds")));
            }
        }
        catch(SQLException ex){
            throw new SQLException(ex);
        }
        return HighscoreList;
    }
    
    public void deleteHighscore(Highscore highscore){
        
    }
}
