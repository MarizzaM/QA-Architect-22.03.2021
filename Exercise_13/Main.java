package com.app;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<Box> boxes = new ArrayList<>();
        Queue<String> customers =  new LinkedList<>();

        PostOffice po = new PostOffice(boxes , customers);
        boxes.add( new Box("chocolate", "Marisha"));
        boxes.add( new Box("flowers", "Natasha"));
        boxes.add( new Box("air balloons", "Dasha"));
        boxes.add( new Box("champagne", "Masha"));
        boxes.add( new Box("Teddy", "Katusha"));

        customers.add("Natasha");
        customers.add("Marisha");
        customers.add("Dasha");
        customers.add("Katusha");
        customers.add("Masha");

        po.serveNextCustomer();
    }
}