package com.example.springboot.lession4controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// Đánh dấu đây là một Controller
// Nơi tiếp nhận các reqquest từ phía người dùng

@Controller
public class WebController {

    // Đón nhận request GET
    @GetMapping("/") // Nếu người dùng request tới địa chỉ "/"
    public String index() {
        return "index"; // Trả về file index.html
    }

    @GetMapping("/about") // Nếu người dùng request tới địa chỉ "/about"
    public String about() {
        return "about"; // Trả về file about.html
    }

    @GetMapping("/hello")
    public String hello(
            // Request param "name" sẽ được gán giá trị vào biến String
            @RequestParam(name = "name", required = false, defaultValue = "") String name,
            @RequestParam(name = "address", required = false, defaultValue = "") String address,
            @RequestParam(name = "age", required = false, defaultValue = "") String age,

            // Model là một object của Spring Boot, được gắn vào trong mọi request.
            Model model) {
        // Gắn vào model giá trị name nhận được
        model.addAttribute("name", name);
        model.addAttribute("address", address);
        model.addAttribute("age", age);

        return "hello"; // trả về file hello.html cùng với thông tin trong object Model
    }

    @GetMapping("/hello2")
    public String hello2(
            @RequestBody Person person,
            // Model là một object của Spring Boot, được gắn vào trong mọi request.
            Model model) {
        // Gắn vào model giá trị name nhận được
        Person per = Person.builder()
                .name(person.getName())
                .email(person.getEmail())
                .age(person.getAge())
                .build();
        model.addAttribute("person", per);

        return "hello2"; // trả về file hello.html cùng với thông tin trong object Model
    }

}
