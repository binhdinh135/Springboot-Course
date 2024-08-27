package com.example.springboot.redisDemo.controller;

import com.example.springboot.redisDemo.model.Student;
import com.example.springboot.redisDemo.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/students")
public class RedisController {
    @Autowired
    private RedisService redisService;

    @PostMapping
    public void addStudent(@RequestBody Student student) {
        redisService.save(student);
    }

    @GetMapping
    public Map<String, Student> getAllStudents() {
        return redisService.findAll();
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable String id) {
        return redisService.findById(id);
    }

    @PutMapping("/{id}")
    public void updateStudent(@PathVariable String id, @RequestBody Student student) {
        Student existingStudent = redisService.findById(id);
        if (existingStudent != null) {
            student.setId(id);
            redisService.update(student);
        }
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable String id) {
        redisService.delete(id);
    }
}
