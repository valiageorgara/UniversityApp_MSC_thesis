package com.thesis.universityapp.controller;

import com.thesis.universityapp.model.Student;
import com.thesis.universityapp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class DemoControllers {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/employees")
    public List<Student> getAllEmployees() {
        return studentRepository.findAll();
    }

    @PostMapping("/create")
    public Student createEmployee(@RequestBody Student employee) {
        return studentRepository.save(employee);
    }
}
