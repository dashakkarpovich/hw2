package com.company;

import java.util.List;

public class Library {
    private List<Book> books;

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void printBookID(Integer id) {
        for (int i = 0; i < books.size(); i++) {
            if (id == books.get(i).getId()) {
                System.out.println(books.get(i));
            }
        }
    }
    public void printBookAuthor(String author){
        for (int i = 0; i < books.size(); i++) {
            if(author==books.get(i).getAuthor()){
                System.out.println(books.get(i));
            }
        }
    }
    public void printBookAge(Integer age){
        for (int i = 0; i < books.size(); i++) {
            if (age == books.get(i).getAge()) {
                System.out.println(books.get(i));
            }
        }
    }
    public void printBookAfterAge(Integer age){
        for (int i = 0; i < books.size(); i++) {
            if (age < books.get(i).getAge()) {
                System.out.println(books.get(i));
            }
        }
    }
    public static void main (String[]args){
    }
    public Library(List < Book > books) {
        this.books = books;
    }
}
