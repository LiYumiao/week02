package com.example.demo;

public class Beer {
    private String band;
    private int year_of_birth;

    public Beer(String band) {
        this.band = band;
    }

    public String getBand() { return band; }

    public void setBand(String band) {
        this.band = band;
    }

    public String toString() {
        return "Beer{" + "band: " + band +"}" ;
    }
}
