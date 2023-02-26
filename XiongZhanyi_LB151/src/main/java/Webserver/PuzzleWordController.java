/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Webserver;

import Applicationserver.Category;
import Applicationserver.PuzzleWord;
import Dataserver.AdministratorDAO;
import Dataserver.FortuneWheelDAO;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named(value = "puzzleWordController")
@SessionScoped
public class PuzzleWordController implements Serializable {
    private Category category;
    private String CategoryName = "";
    private FortuneWheelDAO fortuneWheelDAO = new FortuneWheelDAO();
    private List<PuzzleWord> puzzleWordList = new ArrayList<>();
    
    public String editCategory(Category category){
        this.category = category;
        this.CategoryName = category.getCategoryName();
        this.puzzleWordList = category.getPuzzleWordList();
        return "/puzzleWord.xhtml";
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public List<PuzzleWord> getPuzzleWordList() {
        return puzzleWordList;
    }

    public void setCategoryName(String CategoryName) {
        this.CategoryName = CategoryName;
    }

    public void setPuzzleWordList(List<PuzzleWord> puzzleWordList) {
        this.puzzleWordList = puzzleWordList;
    }
        
    public String deletePuzzleWord(PuzzleWord puzzleWord) throws SQLException, ClassNotFoundException{
        this.fortuneWheelDAO.deletePuzzleWord(puzzleWord);
        return "puzzleWord.xhtml?faces-redirect=true";
    }
}
