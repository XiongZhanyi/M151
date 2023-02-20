/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Applicationserver;

/**
 *
 * @author Xiong Zan Yi
 */
public class PuzzleWord {
    private final int puzzleWord_id;
    private final int category_Id;
    private final String puzzleWord;

    public PuzzleWord(int puzzleWord_Id, int category_Id, String puzzleWord) {
        this.puzzleWord_id = puzzleWord_Id;
        this.category_Id = category_Id;
        this.puzzleWord = puzzleWord;
    }

    public int getPuzzleWord_id() {
        return puzzleWord_id;
    }

    public int getCategory_Id() {
        return category_Id;
    }

    public String getPuzzleWord() {
        return puzzleWord;
    }
}
