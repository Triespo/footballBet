package com.miguel.footballbet.model;

import java.util.Date;
import java.util.Map;

public class Match {

    private final int id;
    private final Team teamHome;
    private final Team teamAway;
    private final Map<Prediction, Float> odds;
    private final Prediction prediction;
    private final Date date;
    private final float probability;
    private boolean checked;

    public Match(int id, Team teamHome, Team teamAway, Map<Prediction, Float> odds, Prediction prediction, Date date, float probability) {
        this.id = id;
        this.teamHome = teamHome;
        this.teamAway = teamAway;
        this.odds = odds;
        this.prediction = prediction;
        this.date = date;
        this.probability = probability;
        checked = false;
    }

    public int getId() {
        return id;
    }

    public Team getTeamHome() {
        return teamHome;
    }

    public Team getTeamAway() {
        return teamAway;
    }

    public Map<Prediction, Float> getOdds() {
        return odds;
    }

    public Prediction getPrediction() {
        return prediction;
    }

    public Date getDate() {
        return date;
    }

    public float getProbability() {
        return probability;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }
}
