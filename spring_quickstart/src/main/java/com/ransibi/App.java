package com.ransibi;

import com.ransibi.service.BookService;
import com.ransibi.service.impl.BookServiceImpl;

public class App {
    public static void main(String[] args) {
        BookService bookService = new BookServiceImpl();
        bookService.save();
    }
}
