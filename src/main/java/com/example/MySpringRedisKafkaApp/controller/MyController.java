package com.example.MySpringRedisKafkaApp.controller;

import com.example.MySpringRedisKafkaApp.model.MyDocument;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/doc")
public class MyController {

    @PostMapping
    public void createNewDoc(@RequestBody MyDocument newDoc) {

    }
}
