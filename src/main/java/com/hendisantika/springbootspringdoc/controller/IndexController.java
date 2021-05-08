package com.hendisantika.springbootspringdoc.controller;

import com.hendisantika.springbootspringdoc.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-springdoc
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 06/03/20
 * Time: 06.55
 */
@RestController("/")
public class IndexController {
    @GetMapping
    public String index() {
        return "Spring Boot Doc. " + new Date();
    }

    @PostMapping(path = "person")
    @ResponseBody
    public Person person(@Valid @RequestBody Person person) {
        return person;
    }
}
