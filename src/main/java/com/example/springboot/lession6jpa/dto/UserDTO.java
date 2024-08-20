package com.example.springboot.lession6jpa.dto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO {

    private Long id;
    private int hp;
    private int stamina;
    private int atk;
    private int def;
    private int agi;

}
