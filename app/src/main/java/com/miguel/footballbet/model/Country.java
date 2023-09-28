package com.miguel.footballbet.model;

import java.util.ArrayList;
import java.util.List;

public class Country {

    private final String name;
    private final List<Competition> competitionList;

    public Country(String name) {
        this.name = name;
        competitionList = new ArrayList<>();
    }

    public void addCompetition(Competition comp){
        competitionList.add(comp);
    }

    public String getName() {
        return name;
    }

    public List<Competition> getCompetitionList() {
        return competitionList;
    }
}
