package com.study.domain;

import java.util.HashSet;
import java.util.Set;

public class BacteriaColony {
    private BacteriaType bacteriaType;

    public BacteriaColony(String type, double weight, String DNACode) {
        bacteriaType = new BacteriaType(type, weight, DNACode);
    }

    public Bacteria getBacteria(int mutationRisk) {
        Bacteria bacteria = new Bacteria(mutationRisk, bacteriaType);
        System.out.println("Bacteria created : "
                + bacteria.getDNACode()
                + " " + bacteria.getType()
                + " " + bacteria.getWeight()
                + " " + mutationRisk) ;
        return bacteria;
    }
}
