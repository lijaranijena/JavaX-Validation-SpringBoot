package com.validate.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.validate.dto.Person;
import lombok.SneakyThrows;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/persons")
public class PersonController {

    @SneakyThrows
    @PostMapping
    public String create(@RequestBody @Valid Person person){
        return new ObjectMapper().writerWithDefaultPrettyPrinter()
                .writeValueAsString(person);

    }
}
