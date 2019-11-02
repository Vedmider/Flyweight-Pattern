package com.study.domain;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class BacteriaType {
    private String type;
    private String DNACode;
    private double weight;

    public BacteriaType(String type, double weight, String DNACode) {
        this.type = type;
        this.weight = weight;
        this.DNACode = DNACode;
    }

    public double getWeight() {
        return weight;
    }

    public String getDNACode() {
        return DNACode;
    }

    public String getType() {
        return type;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof BacteriaType)) {
            return false;
        }
        BacteriaType bacteriaType = (BacteriaType) obj;
        return new EqualsBuilder().append(this.type, bacteriaType.type)
                .append(this.weight, bacteriaType.weight)
                .append(this.DNACode, bacteriaType.DNACode)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(weight)
                .append(type)
                .append(DNACode)
                .toHashCode();
    }
}
