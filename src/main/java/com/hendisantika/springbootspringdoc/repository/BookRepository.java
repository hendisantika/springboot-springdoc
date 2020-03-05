package com.hendisantika.springbootspringdoc.repository;

import com.hendisantika.springbootspringdoc.model.Book;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-springdoc
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 06/03/20
 * Time: 06.46
 */
public class BookRepository {
    private Map<Long, Book> books = new HashMap<>();

    public Optional<Book> findById(long id) {
        return Optional.ofNullable(books.get(id));
    }

    public void add(Book book) {
        books.put(book.getId(), book);
    }

    public Collection<Book> getBooks() {
        return books.values();
    }
}
