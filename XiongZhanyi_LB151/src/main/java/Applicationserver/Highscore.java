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
    private final String name;
    private final Date date;
    private final int moneyBalance;
    private final int numberOfRounds;

    public Highscore(String name, Date date, int moneyBalance, int numberOfRounds) {
        this.name = name;
        this.date = date;
        this.moneyBalance = moneyBalance;
        this.numberOfRounds = numberOfRounds;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }

    public int getMoneyBalance() {
        return moneyBalance;
    }

    public int getNumberOfRounds() {
        return numberOfRounds;
    }
}
