package com.app;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<Continent> continents = new ArrayList<>();

        continents.add(new Continent("Africa", 30_370_000, 1_287_920_000));
        continents.add(new Continent("Antarctica", 14_000_000, 4_490));
        continents.add(new Continent("Europe", 8_600_000, 742_648_000));
        continents.add(new Continent("Australia", 8_600_000, 41_261_000));
        continents.add(new Continent("South America", 20_000_000, 428_240_000));
        continents.add(new Continent("North America", 20_000_000, 587_615_000));

        Collections.sort(continents, new CompareBySizeAndNumberOfPeople());
        System.out.println("\n======== after sort By Size/Population (Ascending) ==========");
        continents.stream().forEach(System.out::println);
    }
}