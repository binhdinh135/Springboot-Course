package com.example.springboot.lession0.lession5_request_post_model;

import lombok.*;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Todo {
    private String title;
    private String detail;

}
