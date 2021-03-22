package com.app;

import java.util.Comparator;

public class ContinentSortBySizeDescending implements Comparator<Continent> {
    @Override
    public int compare(Continent o1, Continent o2) {
        return o2.getM_size().compareTo(o1.getM_size());
    }
}
