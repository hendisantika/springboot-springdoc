package com.hendisantika.springbootspringdoc.controller;

import com.hendisantika.springbootspringdoc.exception.BookNotFoundException;
import com.hendisantika.springbootspringdoc.model.Book;
import com.hendisantika.springbootspringdoc.repository.BookRepository;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-springdoc
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 06/03/20
 * Time: 06.47
 */
@RestController
@RequestMapping("/api/book")
@RequiredArgsConstructor
public class BookController {

    private final BookRepository repository;

    @GetMapping("/{id}")
    public Book findById(@PathVariable long id) {
        return repository.findById(id)
                .orElseThrow(() -> new BookNotFoundException());
    }

    @GetMapping("/")
    public Collection<Book> findBooks() {
        return repository.getBooks();
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Book updateBook(@PathVariable("id") final String id, @RequestBody final Book book) {
        return book;
    }

    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Book patchBook(@PathVariable("id") final String id, @RequestBody final Book book) {
        return book;
    }

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public Book postBook(@NotNull @Valid @RequestBody final Book book) {
        return book;
    }

    @RequestMapping(method = RequestMethod.HEAD, value = "/")
    @ResponseStatus(HttpStatus.OK)
    public Book headBook() {
        return new Book();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public long deleteBook(@PathVariable final long id) {
        return id;
    }
}
