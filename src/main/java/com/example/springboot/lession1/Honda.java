package com.example.springboot.lession1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
public class Honda extends Car {
    private String name;
    private int age;

    @Override
    public void hello() {
        System.out.println("This is a honda with name: " + name + " and age: " + age);
    }
}
