package com.example.springboot.lession1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
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
