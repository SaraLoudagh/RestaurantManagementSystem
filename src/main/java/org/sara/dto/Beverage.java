package org.sara.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class Beverage {
    private static int nextId = 1;
    private String id;
    private String name;
    private double price;
    private boolean alcoholic;

    public Beverage(String name, double price, boolean alcoholic) {
        this.id = String.format("D%03d", nextId++);
        this.name = name;
        this.price = price;
        this.alcoholic = alcoholic;
    }
}
