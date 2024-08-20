package com.example.springboot.lession0.lession1;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Setter
@Getter
public class Girl {
    @Autowired
    private OutFit outfit;
    @Override
    public String toString() {
        return "Girl.java";
    }

}
