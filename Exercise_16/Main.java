package com.app;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Library library = new Library();

        library.addNewBook("Witcher", 13);
        library.addNewBook("Young Wolfhound", 13);
        library.addNewBook("The Hobbit", 5);

        System.out.println(library);

        library.searchForBook("The Hobbit");
        library.searchForBook("aaa");

        library.countBooks();
        library.countShelves();

        library.removeBook("The Hobbit");
        library.removeBook("Hobbit");

        library.countBooks();
        library.countShelves();
    }
}