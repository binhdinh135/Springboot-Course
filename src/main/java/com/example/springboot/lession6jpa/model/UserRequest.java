package com.example.springboot.lession6jpa.model;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRequest {

    private int hp;
    private int stamina;
    private int atk;
    private int def;
    private int agi;

}
