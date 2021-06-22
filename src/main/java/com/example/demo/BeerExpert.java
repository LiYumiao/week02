package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
    public List<Beer> getBrands(String c) {
        List<Beer> brands = new ArrayList<>();
        if (c.equals("amber")) {
            brands.add(new Beer("Jack Amber"));
            brands.add(new Beer("Red Moose"));
        } else {
            brands.add(new Beer("Jali Pale Ale"));
            brands.add(new Beer("Gout Stout"));
        }
        return brands;
    }
}
