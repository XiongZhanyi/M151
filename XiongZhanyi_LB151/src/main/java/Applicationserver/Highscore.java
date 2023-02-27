/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Applicationserver;

import java.util.Date;

/**
 *
 * @author Xiong Zhan Yi
 */
public class Highscore {
    private final int highscore_Id;
    private final String name;
    private final String date;
    private final int moneyBalance;
    private final int numberOfRounds;

    public Highscore(int highscore_Id, String name, Date date, int moneyBalance, int numberOfRounds) {
        this.highscore_Id = highscore_Id;
        this.name = name;
        this.date = date.toString();
        this.moneyBalance = moneyBalance;
        this.numberOfRounds = numberOfRounds;
    }

    public int getHighscore_Id() {
        return highscore_Id;
    }
    
    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public int getMoneyBalance() {
        return moneyBalance;
    }

    public int getNumberOfRounds() {
        return numberOfRounds;
    }
}
