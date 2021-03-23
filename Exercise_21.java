package com.app;

public class Main {

    public static void main(String[] args) {

        //int result = 9/0;

        try {
            int result = 9/0;
        } catch (Exception e) {
            System.out.println("Oops...");
        }
    }
}
