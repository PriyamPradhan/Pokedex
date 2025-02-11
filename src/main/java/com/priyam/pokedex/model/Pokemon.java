package com.priyam.pokedex.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class Pokemon {
    private List<AbilitySlot> abilities;

    private Item item;


    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

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

class Item{
    private String name;
    private String url;


    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }


    public String getUrl() {
        return this.url; }
    public void setUrl(String url) {
        this.url = url; }

}