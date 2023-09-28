package com.miguel.footballbet.model;

import java.util.HashMap;
import java.util.Map;

public class User {

    private final int id;
    private final Map<Match, Float> checkedMatchMap;
    private int betMoney;
    private float totalProbabilities;
    //betMoney x Predicition Odd
    private float currentEarnings;

    public User(int id) {
        this.id = id;
        betMoney = 1;
        totalProbabilities = 0f;
        currentEarnings = 0f;
        checkedMatchMap = new HashMap<>();
    }

    public int getId() {
        return id;
    }

    public Map<Match, Float> getCheckedMatchMap() {
        return checkedMatchMap;
    }

    public int getBetMoney() {
        return betMoney;
    }

    public void setBetMoney(int betMoney) {
        this.betMoney = betMoney;
    }

    public float getTotalProbabilities() {
        return totalProbabilities;
    }

    public void setTotalProbabilities(float totalProbabilities) {
        this.totalProbabilities = totalProbabilities;
    }

    public float getCurrentEarnings() {
        return currentEarnings;
    }

    public void setCurrentEarnings(float currentEarnings) {
        this.currentEarnings = currentEarnings;
    }
}
