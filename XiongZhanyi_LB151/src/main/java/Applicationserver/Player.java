/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Applicationserver;

/**
 *
 * @author Xiong Zan Yi
 */
public class Player {
    private final String Username;
    private int lifePoints = 3;
    private int numOfRounds = 1;
    private int balance = 0;

    public Player(String Username) {
        this.Username = Username;
    }

    public String getUsername() {
        return Username;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public int getNumOfRounds() {
        return numOfRounds;
    }
    
    public int getBalance() {
        return balance;
    }
    
    public void addBalance(int addBalance){
        this.balance += addBalance;
    }
    
    public void deductLifePoint(){
        this.lifePoints--;
    }
    
    public void addRound(){
        this.numOfRounds++;
    }
}
