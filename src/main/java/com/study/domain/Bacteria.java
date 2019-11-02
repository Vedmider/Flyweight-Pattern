package com.study.domain;

public class Bacteria {
    private int mutationRisk;
    private BacteriaType bacteriaType;

    public Bacteria(int mutationRisk, BacteriaType bacteriaType) {
        this.mutationRisk = mutationRisk;
        this.bacteriaType = bacteriaType;
    }

    public int getMutationRisk() {
        return mutationRisk;
    }

    public double getWeight() {
        return bacteriaType.getWeight();
    }

    public String getDNACode() {
        return bacteriaType.getDNACode();
    }

    public String getType() {
        return bacteriaType.getType();
    }
}
