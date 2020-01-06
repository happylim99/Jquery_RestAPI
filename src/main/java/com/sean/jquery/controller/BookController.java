package com.sean.jquery.controller;

import com.sean.jquery.dto.Book;
import com.sean.jquery.dto.ServiceResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    List<Book> bookStore = new ArrayList<>();

    @PostMapping("/saveBook")
    public ResponseEntity<Object> addBook(@RequestBody Book book) {
        bookStore.add(book);
        ServiceResponse<Book> response = new ServiceResponse<>("success", book);
        return new ResponseEntity<Object>(response, HttpStatus.OK);
    }

    @GetMapping("/getBooks")
    public ResponseEntity<Object> getBooks() {
        ServiceResponse<List<Book>> response = new ServiceResponse<>("success", bookStore);
        return new ResponseEntity<Object>(response, HttpStatus.OK);
    }
}
