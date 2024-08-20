package com.example.springboot.lession4controller;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Person {
    private String name;
    private String email;
    private int age;
}
