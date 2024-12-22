package com.imd.exchange.model;

public class Failure {

    private String type;
    private double probability;
    private int duration;

    public Failure(String type, double probability, int duration) {
        this.type = type;
        this.probability = probability;
        this.duration = duration;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getProbability() {
        return probability;
    }

    public void setProbability(double probability) {
        this.probability = probability;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
