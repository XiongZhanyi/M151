/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Applicationserver;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Xiong Zan Yi
 */
public class Category {
    private final int category_Id;
    private final String categoryName;
    private List<PuzzleWord> puzzleWordList = new ArrayList<>();

    public Category(int category_Id, String categoryName) {
        this.category_Id = category_Id;
        this.categoryName = categoryName;
    }

    public int getCategory_Id() {
        return category_Id;
    }

    public String getCategoryName() {
        return categoryName;
    }
    
    public void addPuzzleWord(PuzzleWord puzzleWord){
        this.puzzleWordList.add(puzzleWord);
    }

    public List<PuzzleWord> getPuzzleWordList() {
        return puzzleWordList;
    }
    
}
