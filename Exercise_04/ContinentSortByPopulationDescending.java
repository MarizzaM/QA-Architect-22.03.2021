package com.app;

import java.util.Comparator;

public class ContinentSortByPopulationDescending implements Comparator<Continent> {
    @Override
    public int compare(Continent o1, Continent o2) {
        return o2.getM_population().compareTo(o1.getM_population());
    }
}
