package Webserver;

import Applicationserver.Category;
import Applicationserver.Player;
import Applicationserver.PuzzleWord;
import Dataserver.FortuneWheelDAO;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named(value = "fortuneWheelGame")
@SessionScoped
public class FortuneWheelGame implements Serializable {
    private String username;
    private Player player;
    private FortuneWheelDAO fortuneWheelDAO;
    private Category category;
    private PuzzleWord puzzleWord;
    private String wheelVal = "***";
    private List<String> wheelValues = new ArrayList<>();
    private String inputConsonant = "hi";
    private String hiddenWord = "";
    private Random rand = new Random();
    private boolean spinTheWheelBtn = false;
    private boolean guessBtn = true;
    
    public String startGame() throws SQLException, ClassNotFoundException, Exception{     
        player = new Player(username);
        fortuneWheelDAO = new FortuneWheelDAO();
        if(!fortuneWheelDAO.getCategory().isEmpty()){
            this.category = fortuneWheelDAO.getCategory().get(rand.nextInt(fortuneWheelDAO.getCategory().size()));
        }
        else{
            throw new SQLException("No Category");
        }
        if(!category.getPuzzleWordList().isEmpty()){
            this.puzzleWord = category.getPuzzleWordList().get(rand.nextInt(category.getPuzzleWordList().size()));
            for(int i = 0; i<puzzleWord.getPuzzleWord().length()-1; i++){
                hiddenWord += "_ ";
            }
            hiddenWord += "_";
        }
        else{
            throw new SQLException("No Puzzleword");
        }
        return "/fortuneWheel";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public void setWheelVal(String wheelVal) {
        this.wheelVal = wheelVal;
    }

    public int getLifePoints() {
        return this.player.getLifePoints();
    }

    public int getNumOfRounds() {
        return this.player.getNumOfRounds();
    }
    public int getBalance() {
        return this.player.getBalance();
    }

    public String getCategoryName() {
        return this.category.getCategoryName();
    }
    public String getHiddenWord() {
        return this.hiddenWord;
    }
    
    public String getWheelVal(){
        return this.wheelVal;
    }
    
    public void spinTheWheel(){
        setWheelValues();
        setWheelVal(this.wheelValues.get(rand.nextInt(this.wheelValues.size())));
        setSpinTheWheelBtn(true);
        setGuessBtn(false);
    }
    
    private void setWheelValues() {
        this.wheelValues.add("20");
        this.wheelValues.add("500");
        this.wheelValues.add("100");
        this.wheelValues.add("2500");
        this.wheelValues.add("10");
        this.wheelValues.add("400");
        this.wheelValues.add("1000");
        this.wheelValues.add("Bankrott");
        this.wheelValues.add("300");
        this.wheelValues.add("1500");
        this.wheelValues.add("100");
        this.wheelValues.add("20");
        this.wheelValues.add("2000");
        this.wheelValues.add("40");
        this.wheelValues.add("500");
        this.wheelValues.add("250");
        this.wheelValues.add("600");
        this.wheelValues.add("1250");
    }

    public boolean isSpinTheWheelBtn() {
        return spinTheWheelBtn;
    }

    public boolean isGuessBtn() {
        return guessBtn;
    }

    public void setSpinTheWheelBtn(boolean spinTheWheelBtn) {
        this.spinTheWheelBtn = spinTheWheelBtn;
    }

    public void setGuessBtn(boolean guessBtn) {
        this.guessBtn = guessBtn;
    }

    public void setHiddenWord(String hiddenWord) {
        this.hiddenWord = hiddenWord;
    }
    
    public String guess(){               
        setHiddenWord(inputConsonant);
        setSpinTheWheelBtn(false);
        setGuessBtn(true);
        return "/fortuneWheel";
    }

    public String getInputConsonant() {
        return inputConsonant;
    }

    public void setInputConsonant(String inputConsonant) {
        this.inputConsonant = inputConsonant;
    }
}

