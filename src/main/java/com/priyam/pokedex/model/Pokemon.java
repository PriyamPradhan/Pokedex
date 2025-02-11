package com.priyam.pokedex.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class Pokemon {
    private List<AbilitySlot> abilities;

    private Stat stat;



    // Getters and Setters
    public List<AbilitySlot> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<AbilitySlot> abilities) {
        this.abilities = abilities;
    }

}

class AbilitySlot {
    private Ability ability;
    private boolean is_hidden;
    private int slot;

    // Getters and Setters
    public Ability getAbility() {
        return ability;
    }

    public void setAbility(Ability ability) {
        this.ability = ability;
    }

    public boolean isIs_hidden() {
        return is_hidden;
    }

    public void setIs_hidden(boolean is_hidden) {
        this.is_hidden = is_hidden;
    }

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }
}

class Ability {
    private String name;
    private String url;

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

class Stat {
    @JsonProperty("base_stat")
    private int baseStat;

    @JsonProperty("effort")
    private int effort;

    @JsonProperty("stat")
    private StatDetail stat;

    // Getters and Setters
    public int getBaseStat() {
        return baseStat;
    }

    public void setBaseStat(int baseStat) {
        this.baseStat = baseStat;
    }

    public int getEffort() {
        return effort;
    }

    public void setEffort(int effort) {
        this.effort = effort;
    }

    public StatDetail getStat() {
        return stat;
    }

    public void setStat(StatDetail stat) {
        this.stat = stat;
    }
}

class StatDetail {
    private String name;
    private String url;

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}