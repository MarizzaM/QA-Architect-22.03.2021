package com.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTest {

    @Test
    public void test_search_for_book(){
        Library library = new Library();

        library.addNewBook(TestData.test_search_for_book_hobbit_title, TestData.test_search_for_book_hobbit_shelf);
        library.addNewBook(TestData.test_search_for_book_witcher_title, TestData.test_search_for_book_witcher_shelf);
        library.addNewBook(TestData.test_search_for_book_wolfhound_title, TestData.test_search_for_book_wolfhound_shelf);

        assertEquals(library.searchForBook(TestData.test_search_for_book_wolfhound_title),
                TestData.test_search_for_book_wolfhound_shelf);
        assertEquals(library.searchForBook(TestData.test_search_for_book_witcher_title),
                TestData.test_search_for_book_witcher_shelf);
        assertEquals(library.searchForBook(TestData.test_search_for_book_hobbit_title),
                TestData.test_search_for_book_hobbit_shelf);
    }
    @Test
    public void negative_test_search_for_book(){
        Library library = new Library();

        library.addNewBook(TestData.test_search_for_book_hobbit_title, TestData.test_search_for_book_hobbit_shelf);
        library.addNewBook(TestData.test_search_for_book_witcher_title, TestData.test_search_for_book_witcher_shelf);
        library.addNewBook(TestData.test_search_for_book_wolfhound_title, TestData.test_search_for_book_wolfhound_shelf);

        assertEquals(library.searchForBook(TestData.negative_test_search_for_book_title),
                TestData.negative_test_search_for_book_shelf);
    }
}
