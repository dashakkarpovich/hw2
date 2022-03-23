package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Book book1 = new Book(1, "After 1", 2018, "DK", "A.Todd");
        Book book2 = new Book(2, "After 2", 2019, "DK", "A.Todd");
        Book book3 = new Book(3, "After 3", 2020, "DK", "A.Todd");


        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        Library library = new Library(books);
        library.printBookID(1);
        library.printBookAuthor("A.Todd");
        library.printBookAge(2019);
        library.printBookAfterAge(2020);
        library.printBookAfterAge(2020);
    }
}
