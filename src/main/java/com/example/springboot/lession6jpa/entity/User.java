package com.example.springboot.lession6jpa.entity;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
//@Data
@Setter
@Getter
@Table(name = "usertest", indexes = { @Index(name = "usertest_idx", columnList = "id")})
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "hp")
    private int hp;

    @Column(name = "stamina")
    private int stamina;

    @Column(name = "atk")
    private int atk;

    @Column(name = "def")
    private int def;

    @Column(name = "agi")
    private int agi;

}
