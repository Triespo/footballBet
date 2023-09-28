package com.miguel.footballbet.model;

import java.util.ArrayList;
import java.util.List;

public class Competition {

    private final String name;
    private final List<Team> teamList;

    public Competition(String name) {
        this.name = name;
        teamList = new ArrayList<>();
    }

    public void addTeam(Team team){
        teamList.add(team);
    }

    public String getName() {
        return name;
    }

    public List<Team> getTeamList() {
        return teamList;
    }
}
