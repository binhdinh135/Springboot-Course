package com.example.springboot.lession3configbean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class SimpleBean {
    private String username;

    @Override
    public String toString() {
        return "This is a simple bean, name: " + username;
    }

}
