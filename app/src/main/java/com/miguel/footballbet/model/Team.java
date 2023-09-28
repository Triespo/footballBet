package com.miguel.footballbet.model;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private final String name;
    private final List<Competition> competitionList;
    private final List<Match> matchList;

    public Team(String name) {
        this.name = name;
        competitionList = new ArrayList<>();
        matchList = new ArrayList<>();
    }

    public void addCompetition(Competition comp){
        competitionList.add(comp);
    }

    public void addMatch(Match match){
        matchList.add(match);
    }

    public String getName() {
        return name;
    }

    public List<Competition> getCompetitionList() {
        return competitionList;
    }

    public List<Match> getMatchList() {
        return matchList;
    }
}
