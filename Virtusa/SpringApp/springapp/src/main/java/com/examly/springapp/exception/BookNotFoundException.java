package com.examly.springapp.exception;

public class BookNotFoundException extends Exception {
    public BookNotFoundException(long bookId) {
        super("Could not find book with id " + bookId);
    }
}
