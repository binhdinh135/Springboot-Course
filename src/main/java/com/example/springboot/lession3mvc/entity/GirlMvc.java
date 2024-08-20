package com.example.springboot.lession3mvc.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class GirlMvc {

    private String name;

    @Override
    public String toString() {
        return "Girl(" + this.name + ")";
    }

}
