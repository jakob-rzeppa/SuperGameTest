package com.example.supergametest.SuperGameTest.PlayerCreation;

import com.google.gson.Gson;

public class PlayerCreationInfo {
    private String[] species;
    private String[] jobs;

    public PlayerCreationInfo() {
        this.species = new String[Species.values().length];
        for (Species s : Species.values()) {
            this.species[s.ordinal()] = s.toString();
        }
        this.jobs = new String[Job.values().length];
        for (Job j : Job.values()) {
            this.jobs[j.ordinal()] = j.toString();
        }
    }

    public static String getJSON() {
        Gson gson = new Gson();
        return gson.toJson(new PlayerCreationInfo());
    }
}
