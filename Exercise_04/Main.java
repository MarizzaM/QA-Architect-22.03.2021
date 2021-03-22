package com.app;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<Continent> continents = new ArrayList<>();

        continents.add(new Continent("Africa", 30_370_000, 1_287_920_000));
        continents.add(new Continent("Antarctica", 14_000_000, 4_490));
        continents.add(new Continent("Europe", 10_180_000, 742_648_000));
        continents.add(new Continent("Australia", 8_600_000, 41_261_000));
        continents.add(new Continent("South America", 17_840_000, 428_240_000));
        continents.add(new Continent("North America", 24_709_000, 587_615_000));

        Collections.sort(continents);
        System.out.println("======== after sort By Name ==========");
        continents.stream().forEach(System.out::println);

        Collections.sort(continents, new ContinentSortBySizeAscending());
        System.out.println("\n======== after sort By Size (Ascending) ==========");
        continents.stream().forEach(System.out::println);

        Collections.sort(continents, new ContinentSortByPopulationAscending());
        System.out.println("\n======== after sort By Population (Ascending) ==========");
        continents.stream().forEach(System.out::println);

        Collections.sort(continents, new ContinentSortBySizeDescending());
        System.out.println("\n======== after sort By Size (Descending) ==========");
        continents.stream().forEach(System.out::println);

        Collections.sort(continents, new ContinentSortByPopulationDescending());
        System.out.println("\n======== after sort By Population (Descending) ==========");
        continents.stream().forEach(System.out::println);
    }
}