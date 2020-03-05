package com.hendisantika.springbootspringdoc.controller;

import com.hendisantika.springbootspringdoc.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
public class BookController {

    @Autowired
    private BookRepository repository;
}
