/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dataserver;

import Applicationserver.Category;
import Applicationserver.Highscore;
import Applicationserver.PuzzleWord;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named(value = "fortuneWheelDAO")
@SessionScoped
public class FortuneWheelDAO implements Serializable {
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
    
    public List<Category> getCategory() throws SQLException, ClassNotFoundException{
        List<Category> categoryList = new ArrayList<>();
        List<PuzzleWord> puzzleWordList = new ArrayList<>();
        try{
            Connection con = getConnection();
            if(con == null){
                throw new SQLException("Connection == null");
            }
            Statement stmt = con.createStatement();
            ResultSet rsCategory = stmt.executeQuery("SELECT * FROM `category`;");
            while(rsCategory.next()){
                Category category = new Category(rsCategory.getInt("category_Id"), rsCategory.getString("CategoryName"));
                categoryList.add(category);
            }
  
            ResultSet rsPuzzleWord = stmt.executeQuery("SELECT * FROM `puzzleWord`;");
            while(rsPuzzleWord.next()){
                PuzzleWord puzzleWord = new PuzzleWord(rsPuzzleWord.getInt("puzzleWord_Id"), rsPuzzleWord.getInt("category_Id"), rsPuzzleWord.getString("puzzleWord"));
                puzzleWordList.add(puzzleWord);
            }
            
            for(Category category : categoryList){
                for(PuzzleWord puzzleWord : puzzleWordList){
                    if(category.getCategory_Id() == puzzleWord.getCategory_Id()){
                        category.addPuzzleWord(puzzleWord);
                    }
                }
            }
        }
        catch(SQLException ex){
            throw new SQLException(ex);
        }
        return categoryList;
    }
    
    public void deletePuzzleWord(PuzzleWord puzzleWord) throws SQLException, ClassNotFoundException{
        PreparedStatement statement = getConnection().prepareStatement("DELETE FROM puzzleWord WHERE puzzleWord_Id=" + puzzleWord.getPuzzleWord() + ";");
        statement.execute();
    }
    
    public void deleteCategory(Category category) throws SQLException, ClassNotFoundException{
        PreparedStatement statement = getConnection().prepareStatement("DELETE FROM category WHERE category_Id="+ category.getCategory_Id() +";");
        statement.execute();
    }
    
    public void editPuzzleWord(PuzzleWord puzzleWord, String editedPuzzleWord) throws SQLException, ClassNotFoundException{
        
    }
    public void editCategory(Category category, String editedCategory){
        
    }
}
