package com.example.MySpringRedisKafkaApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MyDocument {
    private String somethingImportant;
    private Integer quantity;
}
