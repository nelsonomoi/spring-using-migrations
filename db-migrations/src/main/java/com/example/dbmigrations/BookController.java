package com.example.dbmigrations;

import com.example.dbmigrations.domain.repository.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    private BookRepository bookRepository;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping("")
    public ResponseEntity fetchAllBooks(){
        return new ResponseEntity(this.bookRepository.findAll(), HttpStatusCode.valueOf(200));
    }


}
