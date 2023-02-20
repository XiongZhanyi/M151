/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Webserver;

import Applicationserver.Category;
import Applicationserver.Player;
import Dataserver.FortuneWheelDAO;
import java.io.Serializable;
import java.sql.SQLException;
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
    private Random rand = new Random();
    
    public String startGame() throws SQLException, ClassNotFoundException, Exception{
        player = new Player(username);
        fortuneWheelDAO = new FortuneWheelDAO();
        this.category = fortuneWheelDAO.getCategory().get(rand.nextInt(fortuneWheelDAO.getCategory().size()));
        return "/fortuneWheel";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
}
