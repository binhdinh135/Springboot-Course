package com.example.springboot.lession1;

import org.springframework.stereotype.Component;

@Component
public class Bikini implements OutFit {
    @Override
    public void wear() {
        System.out.println("This is bikini");
    }

    public void hello() {
        System.out.println("Hello World");
    }
}
