package com.app;

import java.util.HashMap;
import java.util.HashSet;

public class Library {

    HashMap<String, Integer> m_booksMap = new HashMap<>();

    public void addNewBook(String book, int shelf){
        m_booksMap.put(book,shelf);
    }

    public int searchForBook(String book){

        if (m_booksMap.containsKey(book)){
            System.out.println(String.format("The book '%s' is on shelf #%s", book, m_booksMap.get(book)));
            return m_booksMap.get(book);
        }
        return -1;
    }

    public void removeBook (String book){
        if (m_booksMap.containsKey(book)){
            m_booksMap.remove(book);
            System.out.println(String.format("The book '%s' is removed from library", book ));
        } else {
            System.out.println(String.format("The book '%s' is not in the library", book));
        }
    }

    public int countBooks(){
        int count_of_books = 0;
        for (String book : m_booksMap.keySet()) {
            count_of_books++;
        }
        System.out.println(String.format("There are %d books in the library ", count_of_books));
        return count_of_books;
    }

    public int countShelves(){
        HashSet<Integer> shelves = new HashSet<>();
        for (Integer shelf : m_booksMap.values()) {
            shelves.add(shelf);
        }
        System.out.println(String.format("Books in libraries are located on %d shelves", shelves.size()));
        return shelves.size();
    }

    @Override
    public String toString() {
        return "Library{" +
                "m_booksMap=" + m_booksMap +
                '}';
    }
}
